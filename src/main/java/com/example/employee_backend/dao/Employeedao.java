package com.example.employee_backend.dao;

import com.example.employee_backend.model.Employe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Employeedao extends CrudRepository<Employe,Integer>
{
    @Query(value = "SELECT `id`,`code`, `company_name`, `designation`, `mobile_no`, `name`, `password`, `salary`, `username` FROM `employee` WHERE `code`= :empcode", nativeQuery = true)
    List<Employe> SearchEmployee(@Param("empcode") Integer empcode);
}
