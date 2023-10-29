package com.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {
    @GetMapping(path = "/message/{message}")
    public String getMyMessage(@PathVariable String message){
        return "Your message is: " + message;
    }

    //Other usage
    //@GetMapping(path = "/message/{m}")
    //public String getMyMessage(@PathVariable("m") String message){
    //    return "Your message is: " + message;
    //}
}
