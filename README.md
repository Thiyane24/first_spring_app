```markdown
# First Spring App 

A simple, lightweight Spring Boot starter application built to demonstrate REST controllers, dependency injection via services, and basic endpoint routing.

---

## Tech Stack & Requirements

* **Java:** JDK 17+ (Optimized for Java 21 / 27)
* **Framework:** Spring Boot 
* **Build Tool:** Maven 

---

##  Project Structure

```text
src/
├── main/
│   ├── java/
│   │   └── com/example/demo/
│   │       ├── Demo1Application.java         # Main Spring Boot Application Entry Point
│   │       ├── controller/
│   │       │   └── helloworld.java           # REST Controller handling /hello-world requests
│   │       └── service/
│   │           └── HelloWorldService.java    # Business logic service component
│   └── resources/
│       └── application.properties            # Configuration file (Port, App settings)

```

---

## Configuration

The application is configured to run on port **`8081`** by default (customized in `application.properties` or via VM options):

```properties
server.port=8081

```

---

## Getting Started

### 1. Clone the Repository

```bash
git clone [https://github.com/Thiyane24/first_spring_app.git](https://github.com/Thiyane24/first_spring_app.git)
cd first_spring_app

```

### 2. Build and Run the Application

You can run the application directly from your IDE (IntelliJ IDEA, Eclipse, etc.) by executing the `Demo1Application` class, or via the terminal using Maven:

* **Using Maven Wrapper:**
```bash
mvn spring-boot:run

```



---

## API Endpoints

Once the application is running, you can test the endpoints via your web browser or an API client like Postman or `curl`:

### **Hello World Endpoint**

* **URL:** `http://localhost:8081/hello-world`
* **Method:** `GET`
* **Response:**
```text
Hello Thiyane!

```



---

##  Troubleshooting Common Issues

* **404 Not Found (`NoResourceFoundException`):** Ensure your controller classes are located inside a package or sub-package that matches your main application root (e.g., `com.example.demo.controller`), or explicitly declare `@ComponentScan`.
* **UnsatisfiedDependencyException:** Make sure service classes are properly annotated with `@Service`.

```

```
