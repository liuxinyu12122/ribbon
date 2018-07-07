package com.example.demo;

import com.netflix.hystrix.HystrixCircuitBreaker;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class FallBackHystrix {
    public int add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b){
        return -99999;
    }

}
