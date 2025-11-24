1) Title: Demonstrate Continuous Integration and Development using Jenkins 
Aim:To demonstrate Continuous Integration (CI) and Continuous Development (CD) 
using Jenkins. 
Description: 
Continuous Integration (CI) and Continuous Development (CD) are important practices 
in software development that automate the process of building, testing, and deploying 
code. Jenkins, an open-source automation server, is widely used to achieve CI/CD. 

The following steps demonstrate how to use Jenkins for CI/CD: 
1. Create a simple Java application: 
➢ Develop a small Java program (e.g., printing “Hello World” or performing 
simple calculations). 
2. Commit the code to a Git repository: 
➢ Create a Git repository and commit your Java project. 
➢ Ensure the Jenkins server can access the repository. 
3. Create a Jenkins Job: 
➢ Log in to Jenkins and create a new job (Freestyle or Pipeline). 
➢ Configure the job to pull code from the Git repository. 
➢ Set build triggers (for example, build automatically after each commit). 
4. Build the Application: 
➢ Run the Jenkins job to compile the Java code, run tests, and generate an 
executable JAR file. 
5. Monitor the Build: 
➢ Observe the progress and logs in Jenkins. 
➢ View build results and reports (if applicable). 
6. Deploy the Application: 
If the build succeeds, configure Jenkins to deploy the JAR file to a test or 
production server automatically. 
This simple workflow demonstrates how Jenkins can automate the continuous integration 
and deployment of software. In real-world environments, CI/CD pipelines can involve 
multiple stages, such as code analysis, testing, staging, and production deployment. 