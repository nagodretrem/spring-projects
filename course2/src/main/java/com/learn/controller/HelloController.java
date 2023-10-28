package com.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//RequestMapping genelde class seviyesinde kullanilan bir anatasyon
@RequestMapping(path = "/api")
public class HelloController {
    // localhost:8080/api/hello

    //RequestMapping kullanarak GetMapping yazimi
    //@GetMapping(path = "/hello")
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello World";
    }
}
