package com.learn.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    @GetMapping(value = {"/message1", "/message1/{message}"})
    public String getMyMessageWithVariable(@PathVariable(name = "message", required = false) String message){
        return "Your message is: " + message;
    }

    @GetMapping("/message2")
    public String getMyMessageWithParam(@RequestParam(name = "message", required = false) String message) {
        return "Your message is: " + message;
    }
}
