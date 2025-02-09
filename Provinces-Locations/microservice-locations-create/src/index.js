// src/index.js
const express = require('express');
const { ApolloServer } = require('apollo-server-express');
const { typeDefs, resolvers } = require('./schema');
const cors = require('cors');
const bodyParser = require('body-parser');

async function startServer() {
  const app = express();
  app.use(cors());
  app.use(bodyParser.json());

  // Agregar middleware para logging
  app.use((req, res, next) => {
    console.log(`${new Date().toISOString()} - ${req.method} ${req.path}`);
    next();
  });

  const server = new ApolloServer({ 
    typeDefs, 
    resolvers,
    formatError: (error) => {
      console.error('GraphQL Error:', error);
      return {
        message: error.message,
        path: error.path,
        extensions: error.extensions
      };
    },
    context: ({ req }) => {
      console.log('Incoming GraphQL request:', req.body);
      return {};
    }
  });

  await server.start();
  server.applyMiddleware({ app, path: '/graphql' });

  const PORT = process.env.PORT || 4003;
  app.listen(PORT, () => {
    console.log(`🚀 Locations Create service running on http://localhost:${PORT}/graphql`);
    console.log(`Environment variables loaded:
      DB_HOST: ${process.env.DB_HOST}
      DB_NAME_L_P: ${process.env.DB_NAME_L_P}
      DB_PORT: ${process.env.DB_PORT}
      DB_SSL: ${process.env.DB_SSL}
    `);
  });
}

startServer().catch(error => {
  console.error('Error starting server:', error);
  process.exit(1);
});