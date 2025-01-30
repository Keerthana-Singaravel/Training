# Student Management System (Console-Based)

## Overview
The **Student Management System** is a simple console-based application that allows users to manage student records using Core Java and Java 8 Features. This project supports CRUD operations (Create, Read, Update, Delete) without using a database, instead storing data in a CSV file.

## Features
✅ Add new students with details like **ID, Name, Age, Grade, and Email**  
✅ View all students' records  
✅ Search for a student by **ID**  
✅ Update student details  
✅ Delete a student record  
✅ Sort students by **Age**  
✅ Validate email format  
✅ Store and retrieve student data from a **CSV file**  
✅ Prevent duplicate student IDs

## Technologies Used
- **Java 8**
- **Collections Framework** (ArrayList)
- **Streams & Lambda Expressions**
- **Exception Handling**
- **File Handling (CSV)**
- **Regular Expressions (for email validation)**

## Prerequisites
- Java Development Kit (JDK 8 or later)
- IntelliJ IDEA / Eclipse / Any Java IDE
- Git (for version control)

## Project Structure
```
StudentManagementSystem/
│── src/Day21/MiniProject/
│   ├── Student.java         # Student Class
│   ├── StudentManage.java   # Business Logic (CRUD + File Handling)
│   ├── StudentDatabase.java # Main Class with Menu-Driven Interface
│── StudentDatabase.csv      # File for storing student data
│── README.md                # Project Documentation
```

## How to Run the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/StudentManagementSystem.git
   ```
2. Navigate to the project directory:
   ```bash
   cd StudentManagementSystem
   ```
3. Compile the Java files:
   ```bash
   javac src/Day21/MiniProject/*.java
   ```
4. Run the program:
   ```bash
   java src/Day21/MiniProject/StudentDatabase
   ```

## Usage
1. Run the program and choose an option from the menu:
    - **1**: Add Student
    - **2**: View Students
    - **3**: Search Student
    - **4**: Update Student
    - **5**: Delete Student
    - **6**: Sort Students by Age
    - **7**: Exit
2. Follow the on-screen instructions to enter student details.
3. The data will be saved automatically in `StudentDatabase.csv`.

## File Storage Format (CSV)
The student data is stored in `StudentDatabase.csv` with the following format:
```
ID, Name, Age, Grade, Email
1, Keerthu, 20, A, keerthu@gmail.com
2, Bharath, 21, O, bharath@gmail.com
```



