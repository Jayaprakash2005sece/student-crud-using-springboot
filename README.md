# Student CRUD App using Spring Boot

This is a simple CRUD application built with Spring Boot, Spring Data JPA, and PostgreSQL. It allows you to create, read, update, and delete student records via REST APIs.

## 🛠️ Tech Stack
- Java 21
- Spring Boot 3.5.3
- Spring Data JPA
- PostgreSQL
- Maven
- HikariCP (default Spring Boot DB connection pool)

## 🚀 Features
- Add a student
- Get all students
- Get student by ID
- [Extendable] Delete & update endpoints

## 📦 API Endpoints

| Method | Endpoint           | Description          |
|--------|--------------------|----------------------|
| GET    | `/api/student`     | Get all students     |
| POST   | `/api/student`     | Add a new student    |
| GET    | `/api/student/{id}`| Get student by ID    |

## 🧪 Example POST Request Body
```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john@example.com",
  "age": 21,
  "dob": "2003-05-15"
}


🧾 How to Run
Clone the repo

Create a PostgreSQL database (e.g., studentdb)

Update application.properties with your DB credentials

Run the app: ./mvnw spring-boot:run or from your IDE

🧑‍💻 Author
Jaya Prakash