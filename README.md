# Java To‑Do List Application 📝

A **Task Management System** built in **Java** with **JDBC MySQL integration** for storing and managing tasks.  
This project allows users to **add, view, mark as done, and delete tasks** directly from the command line, with data stored in a MySQL database.

---

## 🚀 Features
- ➕ **Add tasks** with a description
- 📋 **View all tasks** with their status
- ✅ **Mark tasks as completed**
- 🗑 **Delete tasks**
- 💾 **Data persistence** using MySQL

---

## 🛠 Technologies Used
- **Java** (Core concepts: OOP, exception handling)
- **JDBC** (Java Database Connectivity)
- **MySQL** (Database for task storage)
- **SQL** (CRUD operations)

---

## 📂 Project Structure
Java-ToDo-List/

src/DBConnection.java

src/TaskManager.java

src/Main.java

README.md



---

## 🗄 Database Structure
**Database Name:** `ToDoList`  
**Table Name:** `tasks`
```sql
CREATE TABLE task (
    id INT PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(255) NOT NULL,
    status VARCHAR(20) DEFAULT 'Pending'
);
```

---

## 💻 How to Run
1. **Clone this repository**
   ```bash
   git clone https://github.com/your-username/Java-ToDo-List.git
   ```

2. **Set up MySQL database**
   - Create a database named `ToDoList`
   - Run the SQL script above to create the `tasks` table

3. **Download MySQL Connector/J**
   - Official download: [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)
   - Choose the platform-independent `.zip` file and extract it.

4. **Add the JAR file to your project**
   - Place `mysql-connector-j-9.0.0.jar` inside a `lib` folder in your project.
   - In your IDE (VS Code / Eclipse), **add it to the classpath**:
     - VS Code: Configure `.classpath` or use the Java extension pack.
     - Eclipse: Right-click project → Properties → Java Build Path → Add External JARs.

5. **Update JDBC URL in your code**
   ```java
   private static final String URL = "jdbc:mysql://localhost:3306/myproject";
   private static final String USER = "root";
   private static final String PASSWORD = "your_password";

6. **Compile and run**
   ```bash
   javac Main.java
   java Main
   ```

---

## 🎯 Learning Outcomes
- Connected Java application to **MySQL database** using JDBC
- Performed **CRUD operations** through SQL queries
- Practiced **modular coding** by separating database connection, operations, and main program
- Improved understanding of **JDBC exception handling**

---

## 🔮 Future Improvements
- Add a **GUI** using JavaFX or Swing
- Implement **task deadlines & priority levels**
- Add **search & filter** functionality
- Use **SQLite** instead of MySQL for portability

---

## 👩‍💻 Author
**Monisha V**  
Aspiring Software Developer | Passionate about Java, Problem-Solving & Databases
