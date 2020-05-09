##Spring Cloud Stream and RabbitMQ Example

This repository is about message driven communication with the Spring Cloud Stream and RabbitMQ.

Before run the applications, you need a RabbitMQ instance.

```sh
docker run -d --name my-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management
```

For run the applications;

```sh
mvn clean package
mvn spring-boot:run
```

After that, you can access payment service on http://localhost:5000/swagger-ui.html

Or you can send manually a request for payment to payment service;
```sh
curl -X POST "http://localhost:5000/payments" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"id\": \"payment-id\", \"price\": -1, \"quantity\": 1, \"stockItemId\": \"red-pen-1\"}"
```

You can access detailed information about the repository on [medium](https://medium.com/@dilaverdemirel/spring-cloud-stream-ve-rabbitmq-ile-microservices-mimaride-message-driven-i%CC%87leti%C5%9Fim-cc1941e31fdd)
