package com.example.employee_backend.data;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeData {
    @GetMapping("/")
    public String Home()
    {
        return "Welcome to Homepage";
    }

}
