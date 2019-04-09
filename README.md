## **Customer service**

Customer service is a part of microservices application Online store. It manages customer data (name, address, etc.).

## **Building**

To compile source code and build Docker image:
```
mvn clean package docker:build
```

## **Running**

To start service in Docker container:
```
docker run marinasavchenko/onlinestore-customersrv:v1
```

## **Running the tests**

To run tests via Maven:
```
mvn clean test
```

## **Technology stack**

* Java
* Spring Boot
* Spring Cloud
* Spring Data

* jUnit
* Mockito

* Maven
* Docker