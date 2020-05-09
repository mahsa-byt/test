package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api")
public class GreetingController {

    //@GetMapping
    @RequestMapping("/greeting")
    public List<GreetingObj> sayGreeting(){
        List<GreetingObj> list = Arrays.asList(new GreetingObj("2", "hahahahha"),
                new GreetingObj("3", "mahsa"),
                new GreetingObj("5", "bayataaaaa"));
        return list;
    }
}
