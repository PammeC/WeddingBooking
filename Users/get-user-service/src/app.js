const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors'); // Asegúrate de importar cors
const userRoutes = require('./routes/userRoutes');

const app = express();

// Configuración de CORS
const corsOptions = {
    origin: ['http://localhost:3000'], // Permitir solicitudes desde este origen
    methods: ['GET', 'POST', 'PUT', 'DELETE'], // Métodos permitidos
    allowedHeaders: ['Content-Type', 'Authorization'], // Cabeceras permitidas
    credentials: true, // Permitir envío de cookies o credenciales
};

// Aplicar CORS con las opciones configuradas
app.use(cors(corsOptions));


// Middleware
app.use(bodyParser.json());

// Rutas
app.use('/api', userRoutes);

module.exports = app;