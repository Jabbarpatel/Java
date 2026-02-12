FROM maven:3.9.2-eclipse-temurin-17

WORKDIR /user-management/backend

ADD pom.xml /user-management/backend/

RUN mvn dependency:go-offline -B

ADD src /user-management/backend/src

EXPOSE 8080

CMD ["mvn", "spring-boot:run"]