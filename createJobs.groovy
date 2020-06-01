pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('countries-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://santiago.apraez@git.pragma.com.co/santiago.apraez/Jenkins-pipeline.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}