## **Customer service**

Customer service is a part of microservices application Online store. It manages customer data.

## **Building**

1. To compile source code and build Docker image:
```
mvn clean package docker:build
```

## **Running**

1. To start service in Docker container:
```
docker run marinasavchenko/onlinestore-customersrv:v1
```

## **Running the tests**

1.To run tests via Maven:
```
mvn clean test
```

## **Technology stack**

* Java 8
* Spring Boot 2
* Spring Cloud
* Spring Data

* jUnit 4
* Mockito

* Maven
* Docker