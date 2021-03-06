package com.jean.hello.api


import groovy.transform.CompileStatic
import groovy.transform.TypeChecked
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CompileStatic
@TypeChecked
@RestController
class DemoApi {


    @GetMapping("/")
    Object list() {
        return "hello world!"
    }
}
