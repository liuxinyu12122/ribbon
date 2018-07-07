package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String add(){
        return restTemplate.getForEntity("http://FASTSERVER/add?a=10&b=3", String.class).getBody();
    }
}
