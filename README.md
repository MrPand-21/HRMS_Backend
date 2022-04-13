# HRMS_Backend

<a href="https://github.com/MrPand-21/HRMS_Backend/graphs/contributors"><img src="https://img.shields.io/github/contributors/MrPand-21/HRMS_Backend.svg?style=for-the-badge"></a>
  <a href="https://github.com/MrPand-21/HRMS_Backend/network/members"><img src="https://img.shields.io/github/forks/MrPand-21/HRMS_Backend.svg?style=for-the-badge"></a>
  <a href="https://github.com/MrPand-21/HRMS_Backend/stargazers"><img src="https://img.shields.io/github/stars/MrPand-21/HRMS_Backend.svg?style=for-the-badge"></a>

# About the Project

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](http://forthebadge.com)

N-Layer Architecture human resource management system project. Using this project, you can create `admins`, `job seekers`, `jobs` and `employers`.
 Along with these, you can find the <a href="">frontend</a> of this project built with react in my profile or you can use this as an api and use the `swagger-ui` interface.
## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

The things you need before installing the software.

* You should download <a href="https://www.postgresql.org/download/"> `PostgreSQL`</a> on your device. 
* You should download <a href="https://www.oracle.com/java/technologies/sdk-downloads.html">`Java Sdk`</a> on your device.
* Lastly, don't forget to download an ide and plugins which you can write codes.

### Installation

A step by step guide that will tell you how to get the development environment up and running.

```
$ First step
$ Another step
$ Final step
```

## Usage

A few examples of useful commands and/or tasks.

```
$ First example
$ Second example
$ And keep this in mind
```

## Deployment

Additional notes on how to deploy this on a live or release system. Explaining the most important branches, what pipelines they trigger and how to update the database (if anything special).

### Server

* Live:
* Release:
* Development:

## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**. Right now there is only one branch which is master.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

# Endpoints

|HTTP|URL|METOT|
|---|---|---|
|GET| https://localhost:8001/ |User List|
|POST| https://localhost:8001/ |User Create|
|GET| https://localhost:8001/id |User Retrieve|
|PUT| https://localhost:8001/id |User Update|
|DELETE| https://localhost:8001/id |User Delete|
|POST| https://localhost:8001/login|User Login|
|POST| https://localhost:8001/register |User Register|


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Native Reference Guide](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#configuration-metadata-annotation-processor)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links
These additional references should also help you:

* [Configure the Spring AOT Plugin](https://docs.spring.io/spring-native/docs/0.9.2/reference/htmlsingle/#spring-aot-maven)
