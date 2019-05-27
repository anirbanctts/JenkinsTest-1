node{
    stage('SCM Checkout'){
     git 'https://github.com/anirbanctts/JenkinsTestProject'
    }
    
    stage('Complie Package'){
     def mvnHome = tool name: 'maven-3', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
}
