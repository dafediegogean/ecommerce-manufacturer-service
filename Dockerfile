FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ecommerce-manufacturer-service.jar
ENTRYPOINT ["java","-jar","/ecommerce-manufacturer-service.jar"]