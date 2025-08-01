# Website Project

This is a full-stack website with React frontend and Spring Boot backend.

## Prerequisites

- Node.js (v16 or higher)
- Java 17 or higher
- Maven

## How to Start the Website

### 1. Start the Backend (Spring Boot)

Open a terminal in the project root and run:

```bash
cd backend
mvn spring-boot:run
```

The backend will start on `http://localhost:8080`

### 2. Start the Frontend (React)

Open another terminal in the project root and run:

```bash
cd frontend
npm install
npm start
```

The frontend will start on `http://localhost:3000`

### 3. Access the Website

- **Frontend**: http://localhost:3000
- **Backend API**: http://localhost:8080
- **H2 Database Console**: http://localhost:8080/h2-console

## Project Structure

```
├── frontend/          # React frontend
│   ├── public/
│   └── src/
│       ├── components/
│       ├── pages/
│       └── App.jsx
└── backend/           # Spring Boot backend
    ├── src/
    │   ├── controller/
    │   ├── service/
    │   ├── repository/
    │   ├── model/
    │   └── Application.java
    └── pom.xml
```

## Available Pages

- `/` - Home page
- `/about` - About page
- `/contact` - Contact page
- `/booking` - Booking page 