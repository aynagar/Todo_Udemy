# Todo Management Web Application

## 📌 Project Description
A Spring Boot-based Todo Management Web Application that enables users to efficiently manage their tasks. It uses **JSP** for the view layer, **Spring MVC** for request handling, and **Spring Data JPA with PostgreSQL** for data persistence. The UI is styled with **Bootstrap** for a clean and responsive experience.

---

## ✅ Features
- User authentication and session management
- Add, update, and delete todos
- Responsive UI using Bootstrap
- PostgreSQL database integration
- Hibernate auto schema update

---

## 🛠 Tech Stack
- **Backend:** Spring Boot, Spring MVC, Spring Data JPA
- **Frontend:** JSP, Bootstrap, HTML, CSS
- **Database:** PostgreSQL
- **Build Tool:** Maven

---

## 🚀 Setup Instructions
1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/todo-app.git
   cd todo-app
   ```

2. **Configure Database:**
   - Create a PostgreSQL database named `todo`
   - Update `application.properties` with your DB credentials:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/todo
     spring.datasource.username=your-username
     spring.datasource.password=your-password
     ```

3. **Build and Run:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the App:**
   - Open [http://localhost:8080](http://localhost:8080) in your browser

---

## 📷 Screenshots
![Welcome Page](Screenshot 2025-11-27 120909.png)

---

## 📄 License
This project is licensed under the MIT License.
<img width="956" height="424" alt="home" src="https://github.com/user-attachments/assets/f45f64a2-42ba-49df-8745-452af80f1f48" />
<img width="959" height="425" alt="todo" src="https://github.com/user-attachments/assets/3cc3d543-4b3c-41b9-bb43-69810efc4ee7" />
