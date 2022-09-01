## using the openjdk image as the base image
FROM maven:latest

#cloning the git
#RUN 'ls -lrt /home/ubuntu/'
#RUN 'chmod -R 777 /home/ubuntu/workspace'
RUN apt-get update && apt-get install -y git
RUN git clone https://github.com/shashidhar0711/springboot_example.git

# specifing a working directory
WORKDIR /springboot_example

# changing the directory
# RUN cd reifenlabelservice/reifenlabel-service/

RUN mvn --version
#RUN mvn install


# Creating a jar or war file  without running any tests
RUN mvn clean package -DskipTests=true

# once get create's the jar file
# again, creating the another directory
RUN mkdir /app

# specifying the working directory
#WORKDIR /app

# setting up the environment variables
#ENV BUILD_VERSION=$BUILD_VERSION

# copying the jar from target path into container root directory
#COPY --from=build /opt/app/target/reifenlabelservice-*.jar ./reifenlabelservice.jar

# exposing the port number into 8080
#EXPOSE 8080

# # used to execute the specific command when the container starts
#CMD ["java", "-jar", "reifenlabelservice-*.jar ./reifenlabelservice.jar"]
