package com.cosmos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @RequestMapping("/departmentFallback")
    public String departmentFallbackMethod(){
        return "Department Service taking too long to respond. Please try again later..";
    }
    @RequestMapping("/employeeFallback")
    public String employeeFallbackMethod(){
        return "Employee Service taking too long to respond. Please try again later..";
    }
}
