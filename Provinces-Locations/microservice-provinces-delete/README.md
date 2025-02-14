# 🗑️ Microservice Provinces Delete

This microservice is responsible for deleting provinces from the system. It is built with **Node.js** and is designed to work within a microservices architecture.

## 🚀 Technologies Used

- **Node.js**
- **Express.js**
- **MySQL/PostgreSQL** (depending on the configuration)
- **Docker**

---

## 📂 Project Structure

microservice-provinces-delete/ │── src/ # Source code directory │── .gitignore # Git ignored files │── Dockerfile # Docker container configuration │── package.json # Project dependencies │── package-lock.json # Dependencies lock file

yaml
Copiar
Editar

---

## 🔧 Setup and Usage

### 📌 1. Installation

Clone the repository and install dependencies:

```bash
git clone https://github.com/your-username/microservice-provinces-delete.git
cd microservice-provinces-delete
npm install
▶️ 2. Running the Server
Development:
bash
Copiar
Editar
npm start
Production with Docker:
bash
Copiar
Editar
docker build -t provinces-delete-microservice .
docker run -p 4002:4002 provinces-delete-microservice
📡 API Endpoints
This microservice exposes a REST API for deleting provinces.

📌 Available Routes
✅ Delete a province:
Request:

h
Copiar
Editar
DELETE /api/provinces/:id
Example using cURL:

bash
Copiar
Editar
curl -X DELETE http://localhost:4002/api/provinces/10
Response:

json
Copiar
Editar
{
  "message": "Province deleted successfully"
}
