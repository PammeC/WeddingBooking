require('dotenv').config();
const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors'); // Agregar esta línea
const authRoutes = require('./routes/authRoutes');

const app = express();

// Configuración de CORS
const corsOptions = {
    origin: ['http://localhost:3000'],
    methods: ['GET', 'POST', 'PUT', 'DELETE'],
    allowedHeaders: ['Content-Type', 'Authorization'],
    credentials: true
};

// CORS Middleware
app.use(cors(corsOptions)); 


// Middleware
app.use(bodyParser.json());

// Rutas
app.use('/api', authRoutes);

module.exports = app;