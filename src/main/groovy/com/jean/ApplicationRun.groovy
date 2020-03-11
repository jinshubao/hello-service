package com.jean

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@CompileStatic
@TypeChecked
@SpringBootApplication
class ApplicationRun {

    static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationRun.class, args)
    }
}
