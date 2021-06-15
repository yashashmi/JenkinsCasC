pipelineJob('''UtilityChargesPipelineTomcat''') {
    logRotator {
        daysToKeep(7)
        numToKeep(5)
        artifactNumToKeep(1)
    }
    concurrentBuild(false)
        definition {
        cpsScm {
            scm {
                git('''https://github.com/yashashmi/UtilityChargesCalculator.git''')
            }
        }
    }
}