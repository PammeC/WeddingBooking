const express = require('express');
const { ApolloServer } = require('apollo-server-express');
const { typeDefs, resolvers } = require('./schema');
const cors = require('cors');
<<<<<<< Updated upstream
const bodyParser = require('body-parser'); // Importa body-parser
=======
const setupSwagger = require('./swaggerConfig'); 
>>>>>>> Stashed changes

async function startServer() {
  const app = express();
  app.use(cors());
  app.use(bodyParser.json()); // Agrega el middleware para procesar JSON

<<<<<<< Updated upstream
  const server = new ApolloServer({ 
    typeDefs, 
    resolvers,
    formatError: (error) => {
      console.error('GraphQL Error:', error);
      return error;
    }
  });
=======
    // Configurar Swagger
    setupSwagger(app);

    const server = new ApolloServer({
      typeDefs,
      resolvers,
      formatError: (error) => {
        console.error('GraphQL Error:', error);
        return {
          message: error.message,
          locations: error.locations,
          path: error.path,
        };
      },
      context: async ({ req }) => {
        return {
          // Aquí puedes agregar contexto si es necesario
        };
      },
    });
>>>>>>> Stashed changes

  await server.start();
  server.applyMiddleware({ app, path: '/graphql' });

<<<<<<< Updated upstream
  const PORT = 4003;
  app.listen(PORT, () => {
    console.log(`🚀 Locations Create service running on http://localhost:${PORT}/graphql`);
  });
=======
    const PORT = 4003;
    app.listen(PORT, () => {
      console.log(`🚀 Locations Create service running on http://localhost:${PORT}/graphql`);
      console.log(`📄 Swagger UI available at http://localhost:${PORT}/api-docs`);
    });
  } catch (error) {
    console.error('Failed to start server:', error);
    process.exit(1);
  }
>>>>>>> Stashed changes
}

startServer().catch((error) => {
  console.error('Error starting server:', error);
});