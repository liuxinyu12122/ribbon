package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("FASTSERVER")
public interface FeighInter {

    @RequestMapping(value = "add",method = RequestMethod.GET)
    public int add(int a,int b);
}
