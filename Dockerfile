FROM openjdk:11
COPY ./target/Scientific_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","Calculator-1.0-SNAPSHOT-jar-withdependencies.jar","org.example.Main"]