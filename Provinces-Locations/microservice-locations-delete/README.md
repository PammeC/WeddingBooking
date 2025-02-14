# 🗑️ Microservice Locations Delete

This microservice is responsible for deleting locations and provinces from the system. It is built with **Node.js** and interacts with a database.

## 🚀 Technologies Used

- **Node.js**
- **Express.js**
- **MySQL/PostgreSQL** (depending on the configuration in `dbConfig.js`)
- **Docker**

---

## 📂 Project Structure

microservice-locations-delete/ │── src/ │ ├── database/ │ │ ├── dbConfig.js # Database configuration │ ├── index.js # Server setup and launch │── .gitignore │── Dockerfile # Docker container configuration │── package.json # Project dependencies │── package-lock.json # Dependencies lock file

yaml
Copiar
Editar

---

## 🔧 Setup and Usage

### 📌 1. Installation

```bash
git clone https://github.com/your-username/microservice-locations-delete.git
cd microservice-locations-delete
npm install
⚙️ 2. Database Configuration
Configure the connection in src/database/dbConfig.js:
javascript
Copiar
Editar
module.exports = {
  host: process.env.DB_HOST || 'localhost',
  user: process.env.DB_USER || 'root',
  password: process.env.DB_PASSWORD || '',
  database: process.env.DB_NAME || 'locations_db',
};
Ensure your database is running with the correct parameters.
▶️ 3. Running the Server
Development:
bash
Copiar
Editar
npm start
Production with Docker:
bash
Copiar
Editar
docker build -t locations-delete-microservice .
docker run -p 4001:4001 locations-delete-microservice
📡 API Endpoints
This microservice exposes a REST API for deleting locations.

📌 Available Routes
✅ Delete a location:
Request:

h
Copiar
Editar
DELETE /api/locations/:id
Example using cURL:

bash
Copiar
Editar
curl -X DELETE http://localhost:4001/api/locations/5
Response:

json
Copiar
Editar
{
  "message": "Location deleted successfully"
}
