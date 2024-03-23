FROM eclipse-temurin:17
COPY target/samp.jar samp.jar
CMD ["java","-jar","samp.jar"]