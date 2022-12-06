package com.example.employee_backend.dao;

import com.example.employee_backend.model.Employe;
import org.springframework.data.repository.CrudRepository;

public interface Employeedao extends CrudRepository<Employe,Integer>
{
}
