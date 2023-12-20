package com.harmeet.rest.webservices.restfulwebservices.filtering.controller;

import com.harmeet.rest.webservices.restfulwebservices.filtering.model.SomeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {
    @GetMapping("/filtering")
    public SomeBean filtering(){
        return new SomeBean("value1","value2","value3");
    }
    @GetMapping("/filtering-list")
    public List<SomeBean> filteringList(){
        return Arrays.asList(new SomeBean("value1","value2","value3"),new SomeBean("value4","value5","value6"));
    }
}
