# 📅 Event Management System – Spring Boot REST API

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-brightgreen?style=for-the-badge&logo=spring)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql)
![Hibernate](https://img.shields.io/badge/Hibernate-JPA-red?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-blueviolet?style=for-the-badge&logo=apachemaven)
![JUnit](https://img.shields.io/badge/JUnit-Testing-success?style=for-the-badge)

A scalable and production-ready **Event Management System** built using **Spring Boot** and **RESTful API principles**.  
This project demonstrates CRUD operations, Hibernate ORM, MySQL integration, logging, unit testing, and custom exception handling.

---

## 🚀 Features

- ✅ Create, Read, Update, Delete (CRUD) Events
- ✅ RESTful API with Spring Boot
- ✅ Hibernate (JPA) ORM
- ✅ MySQL Database (MySQL Workbench compatible)
- ✅ Custom Exception Handling
- ✅ Global Exception Handler
- ✅ Logging using SLF4J & Logback
- ✅ Unit Testing with JUnit & Mockito
- ✅ Clean Layered Architecture

---

## 🛠 Tech Stack

- **Java 21**
- **Spring Boot 3.2.0**
- **Spring Data JPA (Hibernate)**
- **MySQL**
- **Maven**
- **JUnit 5 & Mockito**
- **Logback**
- **Postman (API Testing)**

---

## 📁 Project Structure

```text
event-management
│
├── src/main/java/com/example/eventmanagement
│   ├── controller
│   ├── service
│   ├── repository
│   ├── model
│   ├── exception
│   └── EventManagementApplication.java
│
├── src/test/java/com/example/eventmanagement
│   └── EventServiceTest.java
│
├── src/main/resources
│   ├── application.properties
│
└── pom.xml
```

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/event-management-system.git
cd event-management-system
```

---

### 2️⃣ Create Database (MySQL)

```sql
CREATE DATABASE eventdb;
```

---

### 3️⃣ Configure `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/eventdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.open-in-view=false

logging.file.name=logs/eventapp.log
logging.level.root=INFO
```

---

### 4️⃣ Run the Application

```bash
mvn spring-boot:run
```

Application will start at:

```
http://localhost:8080
```

---

## 📬 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/events` | Create Event |
| GET | `/api/events` | Get All Events |
| GET | `/api/events/{id}` | Get Event by ID |
| PUT | `/api/events/{id}` | Update Event |
| DELETE | `/api/events/{id}` | Delete Event |

---

## 📦 Sample Request

```json
{
  "name": "Tech Conference",
  "location": "Delhi",
  "date": "2026-02-10"
}
```

---

## ❗ Custom Exception Response

```json
{
  "timestamp": "2026-02-03T15:20:30",
  "message": "Event not found with id: 99",
  "status": 404
}
```

---

## 🧪 Testing

```bash
mvn test
```

---

## 📝 Logging

Logs stored in:

```
logs/eventapp.log
```

---

## 🌱 Future Enhancements

- Swagger (OpenAPI documentation)
- DTO & Validation
- Pagination & Sorting
- Authentication (Spring Security)
- Docker support
- Frontend (React/Angular)

---

## 👨‍💻 Author

**Jatin Kumar Chhabra**  
Java Backend Developer

---

## ⭐ Support

If you like this project, please give it a ⭐ on GitHub.