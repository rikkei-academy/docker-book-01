#Maven Build
FROM maven:3.8.6-openjdk-8-slim AS builder
COPY pom.xml /webapi/
COPY src /webapi/src
RUN --mount=type=cache,target=/root/.m2 mvn -f /webapi/pom.xml clean package -DskipTests

#Run
FROM openjdk:8-jre-slim
COPY --from=builder /webapi/target/webapi-0.0.1-SNAPSHOT.jar webapi.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "webapi.jar"]