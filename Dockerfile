FROM openjdk:8-jre-alpine
VOLUME /data
ENV JAVA_OPTS -Xmx256M -Xms256M
ENV TIME_ZONE "Asia/Shanghai"
RUN ln -snf /usr/share/zoneinfo/$TIME_ZONE /etc/localtime && echo $TIME_ZONE > /etc/timezone
COPY build/libs/*.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]
