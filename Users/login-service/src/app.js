require('dotenv').config();
const express = require('express');
const bodyParser = require('body-parser');
const authRoutes = require('./routes/authRoutes');

// CORS Middleware
app.use(cors());

// Configuración más específica de CORS
const corsOptions = {
    origin: ['http://localhost:3000'],
    methods: ['GET', 'POST', 'PUT', 'DELETE'],
    allowedHeaders: ['Content-Type', 'Authorization'],
    credentials: true
  };

const app = express();
// Middleware
app.use(bodyParser.json());

// Rutes
app.use('/api', authRoutes);

module.exports = app;
