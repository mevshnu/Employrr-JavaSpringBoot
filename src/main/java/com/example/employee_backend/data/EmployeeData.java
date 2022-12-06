package com.example.employee_backend.data;


import com.example.employee_backend.model.Employe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeData {
    @PostMapping("/")
    public String Home()
    {
        return "Welcome to Homepage";
    }
    @PostMapping("/search")
    public String Search()
    {
        return "Search";
    }
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Add(@RequestBody Employe e)
    {
        System.out.println(e.getCode());
        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyName().toString());
        System.out.println(e.getMobileNo().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());

        return "added successfully";
    }
    @GetMapping("/view")
    public String View()
    {
        return "view";
    }
    @PostMapping("/delete")
    public String Delete()
    {
        return "delete";
    }
    @PostMapping("/edit")
    public String Edit()
    {
        return "edit";
    }

}
