package com.example.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api")
public class GreetingController {

    //@GetMapping
    @RequestMapping("/greeting")
    public GreetingObj sayGreeting() {
        return new GreetingObj("2", "hahahahha");
    }

    //    @GetMapping
    @RequestMapping("/employee")
    public ResponseEntity<List<Employee>> getEmployees() {
        Employee result = new Employee( "mahsa", "dog", "dodo", 29, "200");
        List<Employee> employeeList = Arrays.asList(new Employee( "mahsa", "dog", "dodo", 29, "200"),
                new Employee( "allen", "dog", "dodo", 29, "200"),
                new Employee( "jesica", "dog", "dodo", 29, "200"));

        return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
    }
}
