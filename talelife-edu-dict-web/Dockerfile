FROM openjdk:8-jre
VOLUME /tmp
ADD springcloud-provider.jar talelife-edu-dict-web.jar
RUN bash -c 'touch /talelife-edu-dict-web.jar'
EXPOSE 5000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Xms100m","-Xmx100m","-jar","/talelife-edu-dict-web.jar"]