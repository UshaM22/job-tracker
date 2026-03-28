# Job Tracker API

A REST API built with Java and Spring Boot to track job applications.

## Technologies Used
- Java
- Spring Boot
- MySQL
- Spring Data JPA
- Spring Security
- REST API

## Features
- User registration
- Add and manage job applications
- Track application status (APPLIED, INTERVIEW, REJECTED, OFFER)
- Get applications by user
- Get applications by status

## API Endpoints

### Users
- POST /api/users/register - Register a new user
- GET /api/users/{id} - Get user by ID
- GET /api/users/email/{email} - Get user by email

### Job Applications
- POST /api/applications - Add a new job application
- GET /api/applications/user/{userId} - Get all applications by user
- GET /api/applications/status/{status} - Get applications by status
- PUT /api/applications/{id} - Update a job application
- DELETE /api/applications/{id} - Delete a job application

## How to Run
1. Clone this repository
2. Set up MySQL database
3. Create database named 'jobtracker'
4. Update application.properties with your database credentials
5. Run the application using your IDE
6. API runs on http://localhost:8080
