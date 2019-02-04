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
          stage("test & SonarQube analysis"){
               steps{
                       withSonaeQubeEnv('sonar'){
                         sh 'mvn test sonar:sonar'
                       }
               }
          }
       }

}