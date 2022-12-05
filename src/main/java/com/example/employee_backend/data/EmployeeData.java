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
    @GetMapping("/search")
    public String Search()
    {
        return "Search";
    }
    @GetMapping("/add")
    public String Add()
    {
        return "add";
    }
    @GetMapping("/view")
    public String View()
    {
        return "view";
    }
    @GetMapping("/delete")
    public String Delete()
    {
        return "delete";
    }
    @GetMapping("/edit")
    public String Edit()
    {
        return "edit";
    }

}
