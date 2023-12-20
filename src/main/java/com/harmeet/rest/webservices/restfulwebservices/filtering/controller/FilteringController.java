package com.harmeet.rest.webservices.restfulwebservices.filtering.controller;

import com.harmeet.rest.webservices.restfulwebservices.filtering.model.SomeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
    @GetMapping("/filtering")
    public SomeBean filtering(){
        return new SomeBean("value1","value2","value3");
    }
}
