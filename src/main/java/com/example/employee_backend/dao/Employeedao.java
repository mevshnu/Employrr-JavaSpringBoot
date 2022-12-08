package com.example.employee_backend.dao;

import com.example.employee_backend.model.Employe;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Employeedao extends CrudRepository<Employe,Integer>
{
    @Query(value = "SELECT `id`,`code`, `company_name`, `designation`, `mobile_no`, `name`, `password`, `salary`, `username` FROM `employee` WHERE `code`= :code", nativeQuery = true)
    List<Employe> SearchEmployee(@Param("code") Integer code);

    @Modifying
    @Transactional
    @Query(value="DELETE FROM `employee` WHERE `id`= :id",nativeQuery = true)
    void DeleteEmployee(@Param("id") Integer id);
}
