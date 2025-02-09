require('dotenv').config();
const { Pool } = require('pg');

const pool = new Pool({
  host: process.env.DB_HOST_L_P,
  user: process.env.DB_USER_L_P,
  password: process.env.DB_PASSWORD,
  database: process.env.DB_NAME_L_P,
  port: process.env.DB_PORT || 5432,
  ssl: process.env.DB_SSL === 'true' ? { rejectUnauthorized: false } : false
});

module.exports = pool;