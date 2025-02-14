Here is the `README.md` file for the **Read Decoration Service** microservice:

---

### 📜 **README.md**
```markdown
# 📖 Read Decoration Service - WeddingBooking

This microservice is responsible for retrieving decoration services in the **WeddingBooking** system using **GraphQL**.

---

## 🚀 Technologies Used

- **Spring Boot** - Backend framework
- **Spring Data JPA** - Database management
- **GraphQL** - API Query Language
- **Springdoc OpenAPI** - API Documentation (Swagger)
- **MySQL/PostgreSQL** - Database
- **Docker** - Containerization
- **CORS Configuration** - Security setup

---

## 📂 Project Structure

```
read-decoration/
│── src/
│   ├── main/
│   │   ├── java/com/weddingBooking/decoration_service/
│   │   │   ├── config/
│   │   │   │   ├── CorsConfig.java
│   │   │   │   ├── SwaggerConfig.java
│   │   │   ├── controller/
│   │   │   │   ├── DecorationController.java
│   │   │   │   ├── GraphQLSwaggerController.java
│   │   │   ├── model/
│   │   │   │   ├── Decoration.java
│   │   │   ├── repository/
│   │   │   │   ├── DecorationRepository.java
│   │   │   ├── service/
│   │   │   │   ├── DecorationService.java
│   │   │   ├── DecorationServiceApplication.java
│   │   ├── resources/
│   │   │   ├── graphql/
│   │   │   │   ├── schema.graphqls
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
git clone https://github.com/PammeC/WeddingBooking.git
cd WeddingBooking/read-decoration
```

### 📌 2. Configure Database

Modify `application.properties` to match your database credentials:

```properties
spring.datasource.url=jdbc:mysql://your-db-host:3306/decorationDB
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
docker build -t read-decoration-service .
docker run -p 8042:8042 read-decoration-service
```

---

## 📡 API Endpoints

### **📌 Available GraphQL Queries**

#### 📝 Get all decoration services:

**GraphQL Query:**
```graphql
query {
  getAllDecoration {
    id_decoration
    name
    price
  }
}
```

---

#### 🔍 Get decoration service by ID:

**GraphQL Query:**
```graphql
query {
  getDecorationById(id_decoration: 1) {
    id_decoration
    name
    price
  }
}
```

---

#### 🔎 Search decoration services by name:

**GraphQL Query:**
```graphql
query {
  searchDecorationByName(name: "Premium Buffet") {
    id_decoration
    name
    price
  }
}
```

---

## 📜 API Documentation (Swagger)

Once the application is running, access the Swagger UI at:

```
http://localhost:8042/swagger-ui.html
```

---
