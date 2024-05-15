FROM eclipse-temurin:21-jdk-alpine as builder
#RUN apk add --no-cache bash procps curl tar
# common for all images
ENV MAVEN_HOME /usr/share/maven
COPY --from=maven:3.9.6-eclipse-temurin-11 ${MAVEN_HOME} ${MAVEN_HOME}
COPY --from=maven:3.9.6-eclipse-temurin-11 /usr/local/bin/mvn-entrypoint.sh /usr/local/bin/mvn-entrypoint.sh
COPY --from=maven:3.9.6-eclipse-temurin-11 /usr/share/maven/ref/settings-docker.xml /usr/share/maven/ref/settings-docker.xml
RUN ln -s ${MAVEN_HOME}/bin/mvn /usr/bin/mvn
ARG MAVEN_VERSION=3.9.6
ARG USER_HOME_DIR="/root"
ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"
RUN mkdir "app"
COPY . /app
WORKDIR /app
RUN mvn clean install

##step2
FROM openjdk:21-slim
RUN mkdir "aplic"
COPY --from=builder app/target/gps-0.0.1-SNAPSHOT.jar /aplic
WORKDIR /aplic
ENTRYPOINT ["java", "-jar", "gps-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080