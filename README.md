<div align="center">
  <a href="https://github.com/MrPand-21/HRMS_Backend/graphs/contributors"><img src="https://img.shields.io/github/contributors/MrPand-21/HRMS_Backend.svg?style=for-the-badge"></a>
  <a href="https://github.com/MrPand-21/HRMS_Backend/network/members"><img src="https://img.shields.io/github/forks/MrPand-21/HRMS_Backend.svg?style=for-the-badge"></a>
  <a href="https://github.com/MrPand-21/HRMS_Backend/stargazers"><img src="https://img.shields.io/github/stars/MrPand-21/HRMS_Backend.svg?style=for-the-badge"></a>
  <br/>
  <br/>
  <a href="https://github.com/MrPand-21/HRMS_Backend">
    <img src="https://github.com/MrPand-21/MrPand-21/blob/main/HRMS.png" height="160" alt="HRMS">
  </a>
  <h3>HRMS_Backend</h3>

  <p align="center">
    <a href="#about-the-project">About</a> •
    <a href="#usage">How To Use</a> •
    <a href="#installation">Installation</a> •
    <a href="#credits">Credits</a> •
    <a href="#reference-documentation">Related</a> •
    <a href="https://github.com/MrPand-21/HRMS_Backend/issues">Report Bug</a> •
    <a href="https://github.com/MrPand-21/HRMS_Backend/issues">Request Feature</a>
  </p>
  <h4 align="center">N-Layer Architecture human resource management system project builted by 
    <a href="https://www.java.com/" target="_blank">Java</a>.
  </h4>
</div>

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

A step by step guide that will tell you how to get the development environment up and running:

1. Clone the repository
```bash
# Clone this repository
$ git clone https://github.com/MrPand-21/HRMS_Backend.git
# Go into the repository
$ cd HRMS_Backend
```
Open this in terminal or you can use your ide!

2. Create PostgreSQL connectinon (If don't use Postgre, execute script in yours)
```bash
# open the Postgre SQL script
$ nano `PostgreDatabaseSQL`
```
Here,  copy the SQL script from here or open it from github and copy.

Then open the Postgre's `pgAdmin4`, under Databases (Servers/Your Server/Databases/) create a database and give its name to it (Default = HRMS). Then find the CREATE Script option (double click to database). It will open a `Query Editor` to you and here, paste the SQL script we copied from `PostgreDatabaseSQL` file and execute the script. Don't forget to refresh database to see the tables.

3. Configure the Connection
you can open the application.properties in terminal:
```bash
#open in terminal
$ nano src/main/resources/application.properties
```
or you can directly open in your code editor. Then, configure your cridentials in the application.properties file. 

4. Create Mernis Connection (Optional)

**This project created in Turkey, that's why it uses Mernis System to check if the person is Turkey citizen or not. If you don't want to use it, you can delete the `mernisService` folder and delete `mernisServiceAdapter.java` and related files.**

To use the mernis service, you can use the <a href="https://easywsdl.com/WsdlGenerator">WSDL Generator</a>. 
If you use IntellijIdea, you can follow the following instructions:

1. In the IntellijIdea interface open Plugins > Marketplace and type EasyWSDL and install the plugin (here, you may need to restart Ide).
2. Open the project again
3. Double click `mernisService` folder and press `EasyWSDL - Update web service` option and it will regenerate all files.
4. Close `mernisService`folder and go `MernisServiceAdapter.java` file in core/utilities/adapters/adapters/concretes and change imports, replace old imports with new file imports and there you are!

If you use Eclipse, you can follow the following instructions:

1. Double click `mernisService` folder and press Add > Connected Service. As url paste https://tckimlik.nvi.gov.tr/service/kpspublic.asmx and press finish button.
2. Close `mernisService`folder and go `MernisServiceAdapter.java` file in core/utilities/adapters/adapters/concretes and change imports, replace old imports with new file imports and there you are!

## Usage - Deployment - Server

Now, you can start the project in HRMSApplication.java. Since we use springboot, you may want to go to the springboot interface.

* Live: http://localhost:8080/swagger-ui.html

Once you open this link after run the application, you can use it. That's it!

# Controllers

In the swagger-ui panel, there are 10 different controllers which you can use. They are :

1. Activation Panel Controller
2. Basic Error Controller
3. City Controller
4. Employer Controller
5. Images Controller
6. Job Controller
7. Job Position Controller
8. Job Seekers Controller
9. Work Places Controller
10. Work Times Controller

Please Refer to API Documentation
[![API Documentation](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)](https://github.com/ahmet-cetinkaya/hrms-project-backend/blob/master/APIDocumentation.md)

## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**. Right now there is only one branch which is master.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request


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
* [Installing and Using EasyWSDL in IntellijIdea from stratch](https://github.com/torukobyte/JavaCampHomework/tree/master/MernisServiceEkleme)

### Additional Links
These additional references should also help you:

* [Configure the Spring AOT Plugin](https://docs.spring.io/spring-native/docs/0.9.2/reference/htmlsingle/#spring-aot-maven)

### Credits

Carabelli - Engin Demiroğ
