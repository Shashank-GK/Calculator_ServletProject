
# Calculator Servlet Project

This is a simple web application developed using Java Servlets to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. The project uses Maven for dependency management and includes HTML pages for user interaction.

## Features

- **Addition**: Adds two numbers and displays the result.
- **Subtraction**: Subtracts the second number from the first and shows the result.
- **Multiplication**: Multiplies two numbers and shows the product.
- **Division**: Divides the first number by the second and shows the result.
- **Modulus**: Computes the remainder of the division of the first number by the second.

## Technologies Used

- **Java Servlet API**: For handling HTTP requests and responses.
- **Maven**: For project dependency management.
- **HTML/CSS**: For front-end user interface.

## Setup and Installation

### Prerequisites

- **Java 8+**: Ensure that you have Java 8 or a higher version installed.
- **Apache Tomcat**: For deploying and running the servlet.
- **Maven**: For managing the project dependencies.

### Build the Project

Navigate to the project directory and run the following Maven command to build the project:

```bash
mvn clean install
```

### Deploy the Application

#### Deploy on Tomcat:

1. Copy the `target/Calculator_ServletProject.war` file to the `webapps` folder of your Apache Tomcat installation.
2. Start Tomcat, and the application will be available at `http://localhost:8080/Calculator_ServletProject`.

#### Using IDE (Eclipse/IntelliJ):

1. Import the project into your IDE as a Maven project.
2. Configure the servlet container (Tomcat) and run the project.

## Usage

1. Open the browser and go to `http://localhost:8080/Calculator_ServletProject/`.
2. Select the desired operation (Addition, Subtraction, Multiplication, etc.).
3. Enter two numbers and click on "Submit" to see the result.

## Project Structure

```
Calculator_ServletProject/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── jsp/
│   │   │           └── servlet/
│   │   │               ├── AdditionServlet.java
│   │   │               ├── DivisionServlet.java
│   │   │               ├── ModulusServlet.java
│   │   │               ├── MultiplicationServlet.java
│   │   │               └── SubtractionServlet.java
│   │   ├── resources/
│   │   ├── webapp/
│   │   │   ├── WEB-INF/
│   │   │   │   └── web.xml
│   │   │   ├── addition.html
│   │   │   ├── division.html
│   │   │   ├── index.html
│   │   │   ├── modulus.html
│   │   │   ├── multiplication.html
│   │   │   └── subtraction.html
│   └── pom.xml
│
└── target/
    └── Calculator_ServletProject.war
```

### Explanation of Project Structure:

- `src/main/java/com/jsp/servlet/`: Contains all the servlet classes (AdditionServlet, DivisionServlet, MultiplicationServlet, etc.) which handle the logic for each arithmetic operation.
- `src/main/webapp/`: Contains HTML files for user input for each operation (`addition.html`, `subtraction.html`, `multiplication.html`, etc.) and a `WEB-INF/web.xml` file for servlet configuration.
- `pom.xml`: The Maven build file that includes project dependencies and plugins.
- `target/`: The compiled project artifacts, including the `.war` file used for deployment.

## Contributing

Feel free to fork this repository, create a branch, and submit a pull request for any bug fixes or improvements.

### Clone the Repository

To clone the repository, run the following command:

```bash
git clone https://github.com/Shashank-GK/Calculator_ServletProject.git
```
