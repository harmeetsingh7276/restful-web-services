package com.harmeet.rest.webservices.restfulwebservices.versioning.controller;

import com.harmeet.rest.webservices.restfulwebservices.versioning.model.Name;
import com.harmeet.rest.webservices.restfulwebservices.versioning.model.PersonV1;
import com.harmeet.rest.webservices.restfulwebservices.versioning.model.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    @GetMapping("/v1/person")
    public PersonV1 getFirstOfPerson(){
        return new PersonV1("Harmeet Singh Gorowada");
    }
    @GetMapping("/v2/person")
    public PersonV2 getSecondOfPerson(){
        return new PersonV2(new Name("Harmeet Singh","Gorowada"));
    }
    @GetMapping(path="/person",params = "version=1")
    public PersonV1 getFirstOfPersonUsingParams(){
        return new PersonV1("Harmeet Singh Gorowada");
    }
    @GetMapping(path="/person",params = "version=2")
    public PersonV2 getSecondOfPersonUsingParams(){
        return new PersonV2(new Name("Harmeet Singh","Gorowada"));
    }
//    @GetMapping("/v2/person")
//    public PersonV2 getSecondOfPerson(){
//        return new PersonV2(new Name("Harmeet Singh","Gorowada"));
//    }
}
