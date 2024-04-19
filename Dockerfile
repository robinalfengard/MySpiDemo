FROM openjdk:21

RUN mkdir /app

COPY consumer/target/consumer-1.0-SNAPSHOT.jar /app/
COPY provider/target/provider-1.0-SNAPSHOT.jar /app/
COPY service/target/service-1.0-SNAPSHOT.jar /app/

WORKDIR /app

CMD java -p . -m consumer/consumer.Main


