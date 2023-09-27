package com.example.demo.controller;

import com.example.demo.config.MyPropertiesCtor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }

    @Autowired
    private MyPropertiesCtor myPropertiesCtor;

    @RequestMapping("/properties")
    String myProp() {
        return myPropertiesCtor.toString();
    }
}

