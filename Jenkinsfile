pipeline {
    agent any
       stages {

          stage("build & SonarQube analysis") {
               steps {
                  withSonarQubeEnv('sonar') {
                          sh 'mvn clean sonar:sonar'
                   }
               }
          }
          stage("test"){
               steps{
                         sh 'mvn test sonar:sonar'
               }
          }
       }

}