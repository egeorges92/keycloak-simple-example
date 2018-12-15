FROM maven:3.5.2-jdk-8 AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn clean package -f /usr/src/app/pom.xml -B -P prod -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer.Slf4jMavenTransferListener=warn

FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY --from=build /usr/src/app/target/app-resource-1.0.0-SNAPSHOT.jar /usr/app/app-resource-1.0.0-SNAPSHOT.jar

# install ssl certificat
COPY ssl/example.org.crt /root/example.org.crt
RUN ${JAVA_HOME}/jre/bin/keytool -import -trustcacerts -file /root/example.org.crt \
    -storepass changeit -noprompt \
    -keystore ${JAVA_HOME}/jre/lib/security/cacerts -alias "example.org"

EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=prod","-jar","/usr/app/app-resource-1.0.0-SNAPSHOT.jar"]
