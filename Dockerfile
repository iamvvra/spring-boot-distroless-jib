FROM maven:3.6.3-jdk-8-openj9 as build-env
WORKDIR /app
COPY ./pom.xml ./pom.xml
RUN mvn dependency:go-offline -B

# FROM dependencies as build-env
ADD . /app/project
WORKDIR /app/project
RUN dir -lrt
RUN mvn clean test
RUN mvn clean package -DskipTests

FROM gcr.io/distroless/java:8
COPY --from=build-env /app/project/target/*.jar /app/app.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","/app/app.jar"]

