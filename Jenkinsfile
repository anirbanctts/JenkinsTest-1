node{
    stage('SCM Checkout'){
        steps{
            sh(echo $env.BRANCH_NAME)
            git(url: 'https://github.com/anirbanctts/JenkinsTestProject',
                    branch: env.BRANCH_NAME,
                    changelog: true
            )
        }
    }
    stage('Complie Package'){
     def mvnHome = tool name: 'maven-3', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
}
