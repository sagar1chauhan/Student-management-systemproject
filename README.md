📚 Student Management System

A simple Spring Boot + Thymeleaf + MySQL web application for managing students.
It allows you to add, view, update, and delete (CRUD) student records with a clean UI.

🚀 Features

Add a new student with first name, last name, and email

View list of all students

Update student details

Delete student records

Responsive UI built with Bootstrap

Uses Spring Data JPA for database operations

🛠️ Tech Stack

Backend: Spring Boot, Spring Data JPA, Hibernate

Frontend: Thymeleaf, Bootstrap 5

Database: MySQL

Build Tool: Maven

Language: Java 17

📂 Project Structure
Student-management-system/
 ├── src/main/java/com/project/studentmanagementsystem
 │   ├── controller      # Handles web requests (StudentController)
 │   ├── model           # Entity class (Student)
 │   ├── repository      # DAO layer (StudentRepository)
 │   ├── service         # Business logic interface
 │   ├── service/impl    # Business logic implementation
 │   └── StudentManagementSystemApplication.java
 │
 ├── src/main/resources
 │   ├── templates       # Thymeleaf templates (students.html, create_student.html, etc.)
 │   ├── static          # CSS, JS, Images
 │   └── application.properties
 │
 └── pom.xml

⚙️ Setup Instructions
1. Clone the repository
git clone https://github.com/your-username/student-management-system.git
cd student-management-system

2. Configure MySQL

Create a database in MySQL:

CREATE DATABASE sms;


Update src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/sms
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

3. Run the application
mvn spring-boot:run

4. Access the app

Open http://localhost:8080/students

📸 Screenshots
Student List Page

(You can add a screenshot here)

Add Student Page

(You can add a screenshot here)

📌 Endpoints
HTTP Method	Endpoint	Description
GET	/students	List all students
GET	/students/new	Show form to add student
POST	/students	Save new student
GET	/students/edit/{id}	Show form to edit
POST	/students/{id}	Update student
GET	/students/delete/{id}	Delete student
👨‍💻 Author

Sagar Chouhan
