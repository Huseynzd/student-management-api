# Student Management API

A simple REST API built with Spring Boot for managing student information.

## About the Project

This project was created to practice Java and Spring Boot fundamentals while learning how REST APIs work. The application allows users to perform basic CRUD operations on student records.

## Features

- Get all students
- Get a student by ID
- Add a new student
- Update existing student information
- Delete a student

## Technologies Used

- Java
- Spring Boot
- Maven
- REST API
- Postman

## API Endpoints

| Method | Endpoint | Description |
|----------|----------|----------|
| GET | /students | Get all students |
| GET | /students/{id} | Get student by ID |
| POST | /students | Create a new student |
| PUT | /students/{id} | Update a student |
| DELETE | /students/{id} | Delete a student |

## Sample Request

```json
{
  "id": 1,
  "name": "Nihat",
  "surname": "Huseynzade",
  "age": 19
}
```

## Learning Goals

This project helped me gain practical experience with:

- Spring Boot basics
- RESTful API development
- HTTP methods
- Request and response handling
- JSON data processing

## Future Improvements

- Database integration (MySQL)
- Spring Data JPA
- Validation
- Exception handling
- Swagger documentation

## Author

Nihat Huseynzade
