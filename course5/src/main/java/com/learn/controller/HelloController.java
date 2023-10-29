package com.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {
    /*
    @GetMapping(path = "/message")
    public String getMyMessage(@RequestParam String message){
        return "Your message is: " + message;
    }
    */
    // Other usage

        @GetMapping(path = "/message")
    public String getMyMessage(@RequestParam("m") String message){
        return "Your message is: " + message;
    }

}
