package com.learn.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {
@GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader){
        return "Your header is : " + myHeader;
    }

}
