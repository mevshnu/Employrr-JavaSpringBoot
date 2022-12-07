package com.example.employee_backend.data;


import com.example.employee_backend.dao.Employeedao;
import com.example.employee_backend.model.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeData {
    @Autowired
    private Employeedao dao;
    @PostMapping("/")
    public String Home()
    {
        return "Welcome to Homepage";
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/search")
    public String Search()
    {
        return "Search";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> Add(@RequestBody Employe e)
    {
        System.out.println(e.getCode());
        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyName().toString());
        System.out.println(e.getMobileNo().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        dao.save(e);
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Employe> View()
    {
        return (List<Employe>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/delete")
    public String Delete()
    {
        return "delete";
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/edit")
    public String Edit()
    {
        return "edit";
    }

}
