package com.employee.start.employee.repository;

import com.employee.start.employee.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmloyeeRepo extends CrudRepository<Employee,Integer> {
    List<Employee> findAll();
    Employee findByEid(int eid);

    List<Employee> findAllByOrderByDesignation_levelAscEmpnameAsc();




}
