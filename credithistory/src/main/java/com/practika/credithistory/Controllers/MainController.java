package com.practika.credithistory.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }
}