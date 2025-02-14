# 🗺️ Microservice Locations Create

This microservice handles the creation of locations and provinces in the system. It is built with **Node.js** and connects to a database via **GraphQL**.

## 🚀 Technologies Used

- **Node.js**
- **Express.js**
- **GraphQL**
- **Docker**
- **MySQL/PostgreSQL** (depending on the configuration in `dbConfig.js`)

---

## 📂 Project Structure

microservice-locations-create/ │── src/ │ ├── database/ │ │ ├── dbConfig.js # Database configuration │ │ ├── schema.js # GraphQL schema definition │ │ ├── resolvers.js # Query and mutation logic │ │ ├── index.js # Server setup and launch │── .gitignore │── Dockerfile # Docker container configuration │── package.json # Project dependencies │── package-lock.json # Dependencies lock file

yaml
Copiar
Editar

---

## 🔧 Setup and Usage

### 📌 1. Installation

```bash
git clone https://github.com/your-username/microservice-locations-create.git
cd microservice-locations-create
npm install
⚙️ 2. Database Configuration
Set up the connection in src/database/dbConfig.js:
javascript
Copiar
Editar
module.exports = {
  host: process.env.DB_HOST || 'localhost',
  user: process.env.DB_USER || 'root',
  password: process.env.DB_PASSWORD || '',
  database: process.env.DB_NAME || 'locations_db',
};
Make sure your database is running with the correct parameters.
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
docker build -t locations-microservice .
docker run -p 4000:4000 locations-microservice
📡 Endpoints and Usage
This microservice uses GraphQL to interact with the database.

📌 Available Queries
You can access the GraphQL API at http://localhost:4000/graphql.

✅ Get all locations:
graphql
Copiar
Editar
query {
  getAllLocations {
    id
    name
    province
  }
}
✅ Create a new location:
graphql
Copiar
Editar
mutation {
  createLocation(name: "Quito", province: "Pichincha") {
    id
    name
    province
  }
}
