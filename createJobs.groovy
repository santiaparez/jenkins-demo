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
                        url 'https://github.com/santiaparez/rest-api-demo.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
