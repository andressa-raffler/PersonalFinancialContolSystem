# Financial Control Application
Financial Control is a Java Spring Boot application designed to help users manage their finances effectively. It provides features to track income, expenses, and financial goals.

## Features
- Income and Expense Tracking: Users can record their income and expenses, categorize transactions, and view summaries of their financial activity.

-  Financial Goals: Users can set financial goals, such as saving for a vacation or paying off debt, and track their progress over time.

- Data Visualization: The application provides charts and graphs to visualize financial data, making it easier for users to understand their financial situation.

## Technologies Used
- Java: The core programming language used for backend development.

- Spring Boot: Framework for building and running Java-based applications.

- Hibernate: Object-relational mapping (ORM) library used for database interaction.

- PostgreSQL: Relational database management system used to store financial data.

- MapStruct: Java-based code generation tool for mapping between DTOs (Data Transfer Objects) and entity classes.

- Spring Data JPA: Part of the Spring Data project, provides easy and standardized data access using JPA (Java Persistence API).

- Jakarta EE: Platform for building enterprise-level Java applications.

# Getting Started
Clone the Repository:
```
bash
Copy code
git clone https://github.com/your-username/financial-control.git
```
## Run the PostgreSQL Database with Docker Compose:

Navigate to the root directory of the project.
Run the following command to start the PostgreSQL database using Docker Compose:
```
docker-compose up -d
```
## Set Up the Application:

Open the application.properties file located in src/main/resources.
Configure the database connection properties to match the PostgreSQL database running in Docker Compose.

## Build and Run the Application:
```
mvn spring-boot:run
```

## Access the Application:
Open a web browser and navigate to http://localhost:9090 to access the application.

## Usage
Upon accessing the application, users will be prompted to log in or create an account.
Once logged in, users can start recording their financial transactions, setting goals, and analyzing their financial data.


## Contributing
Contributions are welcome! If you find any bugs or have suggestions for new features, please open an issue or submit a pull request.

### License
This project is licensed under the MIT License - see the LICENSE file for details.

### Acknowledgements
Special thanks to Spring for providing an excellent framework for building Java applications, and to the entire open-source community for their contributions to the tools and libraries used in this project.

