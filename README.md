# 🎓 CampusCore Project

A Full Stack Student Management System built using Spring Boot (Backend) and HTML, CSS, JavaScript (Frontend).

---

## 🚀 Tech Stack

### 🔹 Backend
- Java 17
- Spring Boot
- REST API
- In-memory Storage (ArrayList)

### 🔹 Frontend
- HTML5
- CSS3 (Modern UI)
- JavaScript (Fetch API)

---

## 📁 Project Structure

campuscore-project
 ├── backend
 │    └── campuscore-api
 └── frontend
      └── campuscore-frontend

---

## ✨ Features

### 🔹 Backend APIs
- Add Student
- Get All Students
- Get Student by ID
- Delete Student
- Topper API (Highest Marks)
- Count API (Total Students)

### 🔹 Frontend Features
- Add Student Form
- Display All Students
- Show Topper
- Show Total Student Count
- Modern Dashboard UI

---

# 🔗 API Endpoints

Base URL:
http://localhost:8080

---

## 1️⃣ Add Student

POST /addStudent

Sample JSON Body:

{
  "id": 1,
  "name": "Farhan",
  "course": "Java",
  "marks": 90
}

---

## 2️⃣ Get All Students

GET /students

---

## 3️⃣ Get Student By ID

GET /students/{id}

Example:
GET /students/1

---

## 4️⃣ Delete Student

DELETE /delete/{id}

Example:
DELETE /delete/1

---

## 5️⃣ Get Topper

GET /topper

Returns student with highest marks.

---

## 6️⃣ Get Total Student Count

GET /count

Returns total number of students.

---

# 🧪 API Testing Using Postman

1. Open Postman
2. Select method (GET / POST / DELETE)
3. Enter URL:
   http://localhost:8080/endpoint
4. For POST:
   - Go to Body → Raw → JSON
   - Paste JSON data
5. Click Send

---

## ▶️ How To Run Backend

1. Open terminal
2. Navigate to backend folder:

cd backend/campuscore-api

3. Run the application:

mvn spring-boot:run

Server will start at:
http://localhost:8080

---

## 🌐 How To Run Frontend

1. Go to:

frontend/campuscore-frontend

2. Open index.html in your browser

⚠ Make sure backend is running before using frontend.

---

## 🧠 Learning Outcomes

- Spring Boot REST API Development
- CRUD Operations
- Custom Business Logic Implementation
- Frontend & Backend Integration
- JSON Handling
- Professional Full Stack Project Structure

---

## 👨‍💻 Author

Farhan Gheri  


