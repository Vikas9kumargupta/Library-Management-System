# 📚 Library Task Manager System

## 🚀 Overview

The Library Task Manager System is a web application designed to help libraries efficiently manage book-related tasks, including book lending, returns, due date tracking, and user management. Built with Spring Boot and Spring Data JPA, it ensures seamless data handling and a smooth user experience.

---

## ✨ Features
✅ **User Authentication & JWT-based Authorization** 🔐
✅ **Book Management (Add, update, delete, view books)** 📚
✅ **Task Management (Assign and track library tasks)** 📋
✅ **Borrowing System (Issue & return books with due date tracking)** 🔄
✅ **Spring Security Implementation** 🛡️
✅ **Database Persistence with Spring Data JPA** 🗄️

---

## 🛠 Technologies Used

🚀 **Spring Boot**
🔐 **Spring Security**
📄 **Spring Data JPA (Hibernate ORM)**
💾 **PostgreSQL / MySQL**
🔑 **JWT (JSON Web Token) Authentication**
🛠️ **Maven / Gradle📝 Swagger / OpenAPI for API Documentation**
✅ **JUnit & Mockito for Testing**

---

⚙️ Installation

Clone the repository:

git clone https://github.com/your-username/library-task-manager.git
cd library-task-manager

Configure the database in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

Build and run the application:

mvn clean install
mvn spring-boot:run

📡 API Endpoints

Method

Endpoint

Description

POST

/api/auth/register

Register a new user

POST

/api/auth/login

Login and obtain JWT

GET

/api/books

Get all books

POST

/api/books

Add a new book

PUT

/api/books/{id}

Update book details

DELETE

/api/books/{id}

Delete a book

POST

/api/tasks

Assign a new library task

GET

/api/tasks

Get all assigned tasks

🤝 Contribution Guidelines

Fork the repository.

Create a feature branch:

git checkout -b feature-name

Commit changes:

git commit -m "Add new feature"

Push to the branch:

git push origin feature-name

Create a pull request.

📜 License

This project is licensed under the MIT License. See LICENSE for details.

📞 Contact

For any queries or contributions, please reach out:📧 Email: your-vikasgup074@gmail.com
🔗 LinkedIn: https://www.linkedin.com/in/work-with-vikas/
💻 GitHub: https://github.com/Vikas9kumargupta

Happy Coding! 🚀

