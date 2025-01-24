require('dotenv').config();
const express = require('express');
const dotenv = require('dotenv');
const routes = require('./routes');

// Cargar variables de entorno desde el archivo .env
dotenv.config();

const app = express();

// Middleware para parsear JSON
app.use(express.json());

// Cargar rutas desde routes.js
app.use('/api', routes);

// Iniciar servidor
const PORT = process.env.PORT || 4000;
app.listen(PORT, () => {
  console.log(`API Gateway corriendo en el puerto ${PORT}`);
});
