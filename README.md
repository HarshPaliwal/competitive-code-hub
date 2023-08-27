# CompetitiveCodeHub Project

## Summary
CompetitiveCodeHub is a Java Spring Boot application designed to synchronize the status of competitive coding problems from various platforms like Hackerrank, Codechef, Codeforces, LeetCode, and CSES.fi. The application allows users to track their solved problems, challenges, and submissions by fetching data from the respective platforms' APIs (where available) and interacting with the user's Github repository.

## Project Structure

```
competitivecodehub
|-- src
|   |-- main
|   |   |-- java
|   |   |   |-- com
|   |   |       |-- paliwal999harsh
|   |   |           |-- competitivecodehub
|   |   |               |-- controller
|   |   |               |-- model
|   |   |               |-- service
|   |   |               |-- view
|   |   |-- resources
|   |       |-- application.properties
|-- test
|   |-- java
|   |   |-- com
|   |       |-- paliwal999harsh
|   |           |-- competitivecodehub
|   |               |-- service
|   |-- resources
```

## Dependencies
The project uses several Spring Boot and Spring Cloud starters to provide various functionalities:

- `spring-boot-starter-actuator`: For monitoring and managing the application.
- `spring-boot-starter-data-jpa`: For accessing and managing the database.
- `spring-boot-starter-graphql`: For implementing GraphQL APIs.
- `spring-boot-starter-mail`: For sending email notifications.
- `spring-boot-starter-thymeleaf`: For handling view templates using Thymeleaf.
- `spring-boot-starter-web`: For building web applications.
- `spring-cloud-starter-netflix-eureka-client`: For registering the application with Eureka server.
- `spring-cloud-starter-vault-config`: For fetching configuration from HashiCorp Vault.
- `spring-shell-starter`: For adding a shell interface to the application.
- `lombok`: For reducing boilerplate code with annotations.
- `spring-boot-devtools`: For enabling hot reloading during development.
- `spring-boot-docker-compose`: For docker-compose support during development.
- `h2database`: For using an in-memory H2 database during development.
- `micrometer-registry-datadog`: For monitoring metrics using DataDog.
- `postgresql`: For using PostgreSQL as the production database.
- `spring-boot-configuration-processor`: For processing configuration annotations.

## Project Description
The CompetitiveCodeHub application is developed using Spring Boot to provide a robust and scalable platform for competitive coders to manage and track their solved problems and challenges across multiple coding platforms. The application includes the following components:

### Model Package
The `model` package contains the entities and data structures used by the application to represent competitive coding problems, challenges, and user data. It includes classes like `Problem`, `Challenge`, and `User` with appropriate attributes and relationships.

### Service Package
The `service` package contains the business logic and services required to interact with the competitive coding platforms and Github repositories. It includes classes like `PlatformService`, `GithubService`, and `ProblemService` to handle API calls, data synchronization, and communication with the Github repository.

### Controller Package
The `controller` package contains the REST controllers that handle incoming HTTP requests and interact with the service layer to process and respond to the user's actions. It includes classes like `PlatformController` and `GithubController` to expose APIs for fetching platform data and managing Github synchronization.

### View Package
The `view` package contains the front-end components implemented using React.js. It provides a user-friendly interface to interact with the application, view solved problems, challenges, and Github repository status. The view package communicates with the backend through REST APIs provided by the controllers.

## How to Use
To use the CompetitiveCodeHub application, you need to follow these steps:

1. Set up the required configurations in the `application.properties` file, including API tokens for the respective competitive coding platforms and Github authentication.

2. Build and run the Spring Boot application using the provided Gradle tasks or using an IDE.

3. Access the application's web interface at the specified URL to interact with the platform.

4. Use the Github view to manage synchronization and view the status of your Github repository.

5. Interact with the platform's views to fetch and display competitive coding problems and challenges.

## Contribution
This project is open for contributions from the community. If you encounter any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

---

Please note that the above README file is a template and should be customized according to your specific project's details. It provides an outline for what information should be included in the README file to effectively communicate the project's purpose, structure, and usage to other developers and users. Additionally, you can further add information about the deployment process, future enhancements, and any other relevant details for your specific project.
