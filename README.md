 Student Service API (Spring Boot Microservice)

## About the Project
An individual **Student Service** application built with Java and Spring Boot, utilizing a standard Maven architecture structured into distinct `controller`, `model`, and `service` layers. It provides core in-memory RESTful endpoints to create, retrieve (all or by ID), and delete student records securely and efficiently.

## Features
- **Create Student (`POST`):** Add new student records.
- **Get All Students (`GET`):** Retrieve a list of all stored students.
- **Get Student by ID (`GET`):** Fetch a specific student record using their unique ID.
- **Delete Student (`DELETE`):** Remove a student record from the in-memory store.

## Tech Stack
- **Language:** Java
- **Framework:** Spring Boot
- **Build Tool:** Maven
- **Testing Tool:** Postman / cURL
- **Version Control:** Git & GitHub

   Link:https://legendary-umbrella-4j944v46j97rh55pv-8080.app.github.dev/students
  (Quick note: The port assumes a local run or an active development server.)
  
---

## How to Run and Access the Service

### 1. Prerequisites
Ensure you have the following installed if running locally:
- Java JDK
- Maven (or use the project's built-in Maven wrapper)

### 2. Start the Application
Open your terminal in the `student-service` folder and execute:
```bash
mvn spring-boot:run
```
*(Alternatively, if running via Codespaces, the port will forward automatically).*

---

## API Endpoints Reference
Base URL: `http://localhost:8080/students`

| Operation | HTTP Method | Endpoint | Description |
| :--- | :--- | :--- | :--- |
| **Create** | `POST` | `/students` | Add a new student record (JSON payload required) |
| **Get All** | `GET` | `/students` | Retrieve all student records |
| **Get by ID** | `GET` | `/students/{id}` | Retrieve a specific student by ID |
| **Delete** | `DELETE` | `/students/{id}` | Delete a student by ID |

