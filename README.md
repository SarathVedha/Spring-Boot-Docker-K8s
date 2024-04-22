Spring Boot Docker With K8s

Check HeapSize:
java -XX:+PrintFlagsFinal -version | grep HeapSize

Normal:
java -Xms80m -Xmx250m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=\Users\vedha\Downloads\heapdump.log -Xlog:gc:\Users\vedha\Downloads\gc.log -jar App.jar --server.port=8080

Containers:
#Giving Write privilage for heap and gc logs
RUN mkdir -m 777 /app/java
ENTRYPOINT [ "java", "-XX:MinRAMPercentage=25", "-XX:MaxRAMPercentage=50", "-XX:+HeapDumpOnOutOfMemoryError", "-XX:HeapDumpPath=/app/java/heapdump.log", "-Xlog:gc:/app/java/gc.log", "-jar", "App.jar" ]
