pipeline {
    agent any
       stages {
         withSonarQubeEnv('sonar') {
          stage("build & SonarQube analysis") {
               steps {
                          sh 'mvn clean sonar:sonar'
               }
          }
          stage("test){
               steps{
                         sh 'mvn test sonar:sonar'
               }
          }
         }
       }

}