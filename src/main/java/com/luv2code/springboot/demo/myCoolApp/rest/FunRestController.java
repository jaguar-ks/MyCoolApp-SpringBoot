package com.luv2code.springboot.demo.myCoolApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${hello.name}")
    private String helloName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello " + this.helloName + "!"  ;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k.";
    }
}
