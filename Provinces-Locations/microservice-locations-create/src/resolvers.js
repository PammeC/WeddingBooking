// src/resolvers.js
const pool = require('./database/dbConfig');

const resolvers = {
  Query: {
    _empty: () => ''
  },
  Mutation: {
    createLocation: async (_, { input }) => {
      const client = await pool.connect();
      try {
        console.log('Attempting to create location with input:', input);
        
        // Primero verificamos si la provincia existe
        const provinceCheck = await client.query(
          'SELECT province_id FROM provinces WHERE province_id = $1',
          [input.province_id]
        );
        
        if (provinceCheck.rows.length === 0) {
          throw new Error(`Province with id ${input.province_id} does not exist`);
        }

        const result = await client.query(
          'INSERT INTO locations (location_name, province_id) VALUES ($1, $2) RETURNING location_id, location_name, province_id',
          [input.location_name, input.province_id]
        );
        
        console.log('Location created successfully:', result.rows[0]);
        return result.rows[0];
      } catch (error) {
        console.error('Error creating location:', error);
        throw new Error(`Failed to create location: ${error.message}`);
      } finally {
        client.release();
      }
    }
  }
};

module.exports = resolvers;