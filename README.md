


# Publisher Kafka

This proyect takes database information simulating clothing products and send it to a topic with Apache Kafka.

![Figura-2-Arquitectura-de-Apache-Kafka-Fuente-Elaboracion-propia](https://github.com/Aldo1609/publisher-kafka/assets/60208224/49cedb3b-f55a-4231-810d-3fcec3d3d7e2)









## Requirements

📏 JDK 17

📏 Springboot 3.0

📏 PostgreSQL

📏 Kafka





## Endpoints

This endpoint finds all the information in the database and sends it to the topic.

```
Type: GET

http://localhost:8080/api/v1/products

```

