const express = require('express');
const { getAllUsers, getUserById } = require('../controllers/userController');

const router = express.Router();


router.get('/users', getAllUsers); // Obtener todos los usuarios
router.get('/users/:id', getUserById); // Obtener un usuario por ID

module.exports = router;
