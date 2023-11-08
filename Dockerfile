FROM openjdk:17
COPY ./target/Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD java -cp Calculator-1.0-SNAPSHOT.jar org.example.Main