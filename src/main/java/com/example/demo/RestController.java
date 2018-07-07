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
    public String add(int a,int b){
        return restTemplate.getForEntity("http://FASTSERVER/add?a="+a +"&b="+b, String.class).getBody();
    }
}
