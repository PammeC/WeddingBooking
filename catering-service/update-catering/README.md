Here is the `README.md` file for the **Update Catering Service** microservice:

---

### 📜 **README.md**
```markdown
# 🔄 Update Catering Service - WeddingBooking

This microservice is responsible for updating existing catering services in the **WeddingBooking** system.

---

## 🚀 Technologies Used

- **Spring Boot** - Backend framework
- **Spring Data JPA** - Database management
- **Springdoc OpenAPI** - API Documentation (Swagger)
- **MySQL/PostgreSQL** - Database
- **Docker** - Containerization
- **CORS Configuration** - Security setup

---

## 📂 Project Structure

```
update-catering/
│── src/
│   ├── main/
│   │   ├── java/com/weddingBooking/catering_service/
│   │   │   ├── config/
│   │   │   │   ├── CorsConfig.java
│   │   │   │   ├── SwaggerConfig.java
│   │   │   ├── controller/
│   │   │   │   ├── CateringController.java
│   │   │   ├── model/
│   │   │   │   ├── Catering.java
│   │   │   ├── repository/
│   │   │   │   ├── CateringRepository.java
│   │   │   ├── service/
│   │   │   │   ├── CateringService.java
│   │   │   ├── CateringServiceApplication.java
│   │   ├── resources/
│   │   │   ├── application.properties
│── .gitignore
│── Dockerfile
│── pom.xml
│── README.md
```

---

## 🔧 Setup and Usage

### 📌 1. Clone Repository

```bash
git clone https://github.com/Pammec/WeddingBooking.git
cd WeddingBooking/update-catering
```

### 📌 2. Configure Database

Modify `application.properties` to match your database credentials:

```properties
spring.datasource.url=jdbc:mysql://your-db-host:3306/cateringDB
spring.datasource.username=your-username
spring.datasource.password=your-password
```

### 📌 3. Build and Run

#### Run Locally:
```bash
mvn spring-boot:run
```

#### Run with Docker:
```bash
docker build -t update-catering-service .
docker run -p 8073:8073 update-catering-service
```

---

## 📡 API Endpoints

### **📌 Update an existing catering service**
**Endpoint:** `PUT /cateringU/update/{id_catering}`

#### 🔄 Request:
```json
{
  "name": "Updated Catering Name",
  "price": 2500.00
}
```

#### ✅ Response:
```json
{
  "message": "Edit catering service successfully"
}
```

---

## 📜 API Documentation (Swagger)

Once the application is running, access the Swagger UI at:

```
http://localhost:8073/swagger-ui.html
```

---

## 📝 License

This project is licensed under the **MIT** license.

📌 **Author:** [PammeC](https://github.com/PammeC)
```
