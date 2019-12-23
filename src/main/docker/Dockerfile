FROM flywithu/oraclejdk8
VOLUME /tmp
ADD manage-0.0.1-SNAPSHOT.jar resume-manage.jar
ENTRYPOINT ["java", "-Xmx256m","-Xms256m", "-Xss256k", "-Djava.security.egd=file:/dev/./urandom","-jar", "/resume-manage.jar", "--spring.profiles.active=prod"]
