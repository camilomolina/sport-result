FROM camilomolina/java:8.0.111

MAINTAINER Camilo Molina <camilo.molina.orth@gmail.com>

ADD teams-0.0.1.jar /usr/local/app/sport-result/app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xdebug", "-Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n", "-jar", "/usr/local/app/sport-result/app.jar"]
#ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/usr/local/app/sport-result/app.jar"]
