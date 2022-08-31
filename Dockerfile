## using the openjdk image as the base image
FROM openjdk

# create a new directory inside the container
RUN mkdir /sampleJavaApp

# copying the current existing file from host machine into image path directory
COPY . sampleJavaApp

# working directory
WORKDIR /sampleJavaApp

# run the application
RUN javac HelloWorld.java

# used to execute the specific command when the container starts
CMD [ "java", "HelloWorld" ]
