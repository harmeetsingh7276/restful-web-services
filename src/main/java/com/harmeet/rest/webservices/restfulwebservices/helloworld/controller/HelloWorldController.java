package com.harmeet.rest.webservices.restfulwebservices.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(path = "/hello-world", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World 111112222221";
    }
}
