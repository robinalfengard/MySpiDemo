#Build
FROM openjdk:21 as builder
RUN mkdir /app
COPY consumer/target/consumer-1.0-SNAPSHOT.jar /app/
COPY provider/target/provider-1.0-SNAPSHOT.jar /app/
COPY service/target/service-1.0-SNAPSHOT.jar /app/

#Run
FROM openjdk:21
WORKDIR /app
COPY --from=builder /app .
CMD java -p . -m consumer/consumer.Main


