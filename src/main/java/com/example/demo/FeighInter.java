package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "FASTSERVER" , fallback = FallBackHystrix.class)
public interface FeighInter {

    @RequestMapping(value = "add",method = RequestMethod.GET)
    public int add(@RequestParam(value = "a") int a,@RequestParam(value = "b")  int b);
//    public int add(int a, int b); 这样写会报错

}
