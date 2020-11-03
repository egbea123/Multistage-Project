# Random Number
This is a project to practice Multistage pipeline jenkins project
The application is based on java to generate random ticket numbers,
spring boot to create project structure for the ticket generator,
and maven to compile the program

**Tool required for the the application:**
1. Java 11
2. Maven
3. Spring boot

**How to start**
- Run the main method in the [App class](/src/main/java/com/simplilearn/ticketGenerator)
- Run the following maven command from the terminal: `mvn clean package spring-boot:run`
- Run the following maven command from the terminal: `mvn clean package exec:java`
- Run the following maven commdand from the /home/devops002/eclipse-workspace/ticketGenerator
   - Run mvn clean
   - Run mvn clean install

**Create an executable jar**
-If a user want to generate an executable jar in the target directory using the command: `mvn clean package`

- Run the application Random number ticker application
    $java -jar target/executable jar

//Git commands to push the project to Remote repo
To clone the project to local system
https://github.com/egbea123/Multistage-Project.git
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/egbea123/Multistage-Project.git
git push -u origin main

