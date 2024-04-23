FROM gradle:7.5.1-jdk17 AS build
COPY --chown=gradle:gradle ./ /home/gradle/src/
WORKDIR /home/gradle/src
RUN gradle build --no-daemon 

FROM openjdk:17
EXPOSE 8080
WORKDIR /app
COPY --from=build /home/gradle/src/build/libs/*.jar ./meigen-generator.jar
ENV APP_API_KEY ADD_API_KEY_HERE
ENTRYPOINT ["java", "-jar", "meigen-generator.jar"]