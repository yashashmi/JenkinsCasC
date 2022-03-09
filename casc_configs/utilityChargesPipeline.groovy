pipelineJob('''UtilityChargesPipelineTomcat''') {
    logRotator {
        daysToKeep(7)
        numToKeep(5)
        artifactNumToKeep(1)
    }
    
        definition {
        cpsScm {
            scm {
                git('''https://github.com/yashashmi/UtilityChargesCalculator.git''')
                 { node -> // is hudson.plugins.git.GitSCM
                    node / gitConfigName('Yasub Hashmi')
                    node / gitConfigEmail('yas.hashmi@gmail.com')
                 }
            }
        }
        }
}
