# Employee Information System

## Overview
This project is a web-based application for managing employee information, including adding, updating, searching, and displaying employee records. The frontend is built using HTML, CSS, and JavaScript, while the backend is implemented with Spring Boot to provide API endpoints for data management.

## Table of Contents
1. [Pre requisites](#pre-requisites)
1. [Project Structure](#project-structure)
2. [Features](#features)
3. [Usage Instructions](#usage-instructions)
4. [API Endpoints](#api-endpoints)
5. [File Descriptions](#file-descriptions)
6. [Setup and Installation](#setup-and-installation)
7. [Database Connection](#database-connection)
8. [Backend Instructions](#backend-instructions).
9. [Technologies Used](#technologies-used)
10. [Postman Link](#postman-link)
11. [Working Screenshots](#working-screenshots)

## Pre-requisites
1. Java Development Kit (JDK) - Version 8 or higher is recommended for running the Spring Boot application.
2. Java installed on the system.
3. Spring Tool Suite 4 software and application.
4. Java Script installed on the system.
5. VS Code with the following extentions
   - Code Runner
   - Live Server
   - Prettier
6. My SQL Server and Workbench
   - Make sure to create a database (e.g., test_db) and configure its credentials in the application.properties file.
7. Postman
8. Web Browser

## Project Structure
The project contains the following main files:
- **`index.html`**: Landing page with side navigation.
- **`photo.html`**: Welcome page with an introduction.
- **`employeeRegistration.html`**: Form for employee data entry.
- **`searchEmp.html`**: Search form with delete functionality.
- **`fullTable.html`**: Table view of all employee records.

## Features
- **Employee Registration**: A form to add new employees.
- **Employee Search**: Search employees by ID and delete records.
- **Display All Employees**: View a list of all employees in a tabular format.
- **File Upload**: Option to upload a resume or CV.
- **Responsive Side Navigation**: For easy navigation between pages.

## Usage Instructions
1. Firstly start the backend code,i.e., the STS 4 code.(How to do it is given below).
2. Connect it with database.(How to establish it is given below).
3. Open `index.html` to access the main menu.
4. Use the **New Employee Registration** form to add employees.
5. Search and delete employee records on the **Search Employee** page.
6. View a complete list of employees on the **All Employees** page.

## API Endpoints
The following REST API endpoints are available (assuming the Spring Boot server is running locally):
- `GET /api/v1/products/{id}` - Fetch a specific employee by ID.
- `POST /api/v1/product` - Add a new employee.
- `DELETE /api/v1/products/{id}` - Delete an employee by ID.
- `GET /api/v1/products` - Fetch all employees.
- `PUT /api/v1/products/{id}` - Update employee data.

## File Descriptions
- **`index.html`**: The main landing page with navigation links to register new employees, search, and view the complete employee table.
  - **Side Navigation**: Links to different pages within the application.
  - **JavaScript Functions**: Used to open and close the side navigation.

- **`photo.html`**: An introductory page with a welcome message and navigation to the employee registration page.

- **`employeeRegistration.html`**: A form to capture employee details such as name, age, gender, PAN number, email, etc.
  - **Resume Upload**: Option for employees to upload a resume.
  - **JavaScript Validations**: Ensures PAN numbers are unique before submission.

- **`searchEmp.html`**: A page to search for employees by ID.
  - **JavaScript Functions**: Handles fetching data and populating the employee details table, as well as deleting records by ID.

- **`fullTable.html`**: Displays all employee data in a table format.
  - **JavaScript**: Handles fetching and populating data for all employee records.

## Setup and Installation
1. Download the frontend zip file.
2. Download the backend zip file.
3. Launch the backend file and ensure it is connected to the database.
4. Open `index.html` to start using the application.

## Database Connection
1. To connect the database, integrate Spring Tool Suite (STS) with MySQL:
2. Create a table named **product** in your local database schema.
3. In the application properties file, add the following configurations:
   ```properties
   spring.application.name=testing
   spring.jpa.hibernate.ddl-auto=update
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.show-sql=true
   spring.datasource.url=jdbc:mysql://localhost:3306/test_db
   spring.datasource.username=<your-database-username>
   spring.datasource.password=<your-database-password>
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
4. First, launch the backend project in Spring Tool Suite (STS), named **"testing"**, and verify the database connection.
5. Make sure to add your database schema name in your above code, so that the table will be created in the required database. In our case, we have chosen **/test_db** in our
   spring.datasource.url=jdbc:mysql://localhost:3306/test_db code.
6. Once the backend is running and connected to the database, open `index.html` from the frontend to access the application.

## Backend Instructions
Make sure to have the following dependecies installed in your system before executing it
  - Lombok Developer Tools
  - Spring Web
  - Spring Data JPA SQL
  - MySQL Driver SQL
  - MS SQL Server Driver SQL
 - These dependencies can be installed from https://start.spring.io/

## Technologies Used
- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java (Spring Boot API endpoints)
- **Database**: MySQL

## Postman Link
For detailed API testing, refer to the [Postman Documentation](https://documenter.getpostman.com/view/35948743/2sAY4uCNrB).

## Working Screenshots
- **Index Page**: ![Index Page](https://github.com/HardikMalik20/ProjectVE2/blob/08b9cefc7271181575e471d71638c2bcc71abe9c/F2.PNG)
- **Employee Registration Page**: ![Employee Registration Page]()
- **Database Example**: ![Database Working](https://github.com/HardikMalik20/ProjectVE2/blob/d8bb62c85aadf95b9bf44e687a1b6c09adbe630b/Db1.PNG)
- **Spring Tool Suite (STS4)**: ![STS 4 working](https://github.com/HardikMalik20/ProjectVE2/blob/46d705d5779c1b172e49f847fcb4221fabb6ad36/B1.PNG)
