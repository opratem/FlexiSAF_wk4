# 🏫 FlexiSAF Week 4 — Persistence Frameworks (JPA / Hibernate)

This project demonstrates the use of **Persistence Frameworks** in Java — specifically **JPA (Java Persistence API)** and **Hibernate** — for mapping Java objects to relational database tables.

It is developed as part of **ELS10 Week 4** under the topic:  
**Persistence Frameworks (JPA/Hibernate), Overview of ORM paradigms, implementing entity classes and repositories, persisting data, querying with Hibernate.**

---

## 🎯 Objectives

The main goal of this lesson is to:

- Understand the concept of **Object Relational Mapping (ORM)**.
- Learn how to use **JPA/Hibernate** to persist Java objects in a database.
- Design **entity classes** using JPA annotations.
- Implement **repositories** for data access.
- Demonstrate relationships between entities using annotations like `@OneToMany` and `@ManyToOne`.

---

## ⚙️ Technologies Used

| Technology | Purpose |
|-------------|----------|
| **Java 17** | Programming language |
| **Spring Boot 3.5.6** | Application framework |
| **Spring Data JPA** | Data persistence layer |
| **Hibernate** | ORM implementation for JPA |
| **H2 Database** | In-memory test database |
| **Lombok** | Reduces boilerplate code |
| **Maven** | Build and dependency management |

---

## 🧩 Key Concepts Demonstrated

### 🔹 Object Relational Mapping (ORM)
ORM is a technique for converting data between **Java objects** and **database tables** automatically using metadata and annotations.

### 🔹 JPA / Hibernate Annotations Used
| Annotation | Purpose |
|-------------|----------|
| `@Entity` | Marks the class as a persistent JPA entity |
| `@Table(name = "...")` | Defines the database table name |
| `@Id` | Declares the primary key |
| `@GeneratedValue(...)` | Defines ID generation strategy |
| `@Column(...)` | Sets column constraints |
| `@Enumerated(EnumType.STRING)` | Persists enum values as strings |
| `@OneToMany`, `@ManyToOne` | Defines relationships between entities |
| `@Lob` | Handles large text fields |
| `@Data` (Lombok) | Auto-generates getters, setters, etc. |

---

## 🧠 Entities Overview

### 🧍 Employee Entity
Represents a staff member in the school system.  
Each employee can have multiple leave requests.

