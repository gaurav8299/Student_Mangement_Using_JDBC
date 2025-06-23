# 📚 Student Management App (JDBC + MySQL)

A simple Java command-line application to manage student records using **JDBC** and **MySQL**.

## 🚀 Features

- ✅ Add Student  
- ❌ Delete Student  
- 📄 Display All Students  
- 🔚 Exit App  

## 📋 Menu Options

Welcome to the Student Management App
PRESS 1 to ADD Student
PRESS 2 to Delete student
PRESS 3 to display student
PRESS 4 to Exit App


## 🛠️ Tech Stack

- Java (JDK 8+)
- JDBC API
- MySQL Database

## 🗃️ Database Setup

1. **Create Database**
   ```sql
   CREATE DATABASE student_manage;
2. **Create Table**
3. USE student_manage;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    sname VARCHAR(100),
    sphone VARCHAR(15),
    scity VARCHAR(100)
);

***🧑‍💻 How to Run***

Clone the repo:

bash
git clone https://github.com/yourusername/jdbc-project.git
cd jdbc-project
Update your MySQL credentials in the Java code (e.g., ConnectionProvider.java):

java (CP.java) // Connection Provider Class
String url = "jdbc:mysql://localhost:3306/student_manage";
String user = "root";
String password = "yourpassword";
Connection con = DriverManager.getConnection(url, user, password);


Compile and run the app:

bash
javac Start.java
java Start
