package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    FeighInter feighInter;

//    @RequestMapping(value = "add",method = RequestMethod.GET)
//    public String add(int a,int b){
//        return restTemplate.getForEntity("http://FASTSERVER/add?a="+a +"&b="+b, String.class).getBody();
//    }

    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String add(int a,int b){
        return String.valueOf(feighInter.add(a, b));
    }

}
