package com.employee.start.employee.controller;

import com.employee.start.employee.entity.Employee;
import com.employee.start.employee.repository.EmloyeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
import java.util.*;

@RestController
@RequestMapping("/employee")
public class employeControl {
    @Autowired
    EmloyeeRepo repo;

  //Get The Details Of All Employees
 @RequestMapping(method = RequestMethod.GET)
 public ResponseEntity<Object> showAllEmployees(){
    // List<Employee> employees=repo.findAll();

     Object list=repo.findAllByOrderByDesignation_levelAscEmpnameAsc();

     return new ResponseEntity<>(list, HttpStatus.OK);
 }
// Get Details By ID Of The Employees
 @RequestMapping(value="/{eid}",method=RequestMethod.GET,produces = "application/json")
public ResponseEntity get(@PathVariable int eid) {
     if (eid < 0) {
         return new ResponseEntity(HttpStatus.BAD_REQUEST);
     }
     Employee employee = repo.findByEid(eid);

     if (employee == null) {
         return new ResponseEntity(HttpStatus.NOT_FOUND);
     }
return new ResponseEntity(employee,HttpStatus.OK);
 }


 //delete Employees By  Their ID
   @RequestMapping(value="/{eid}",method=RequestMethod.DELETE)
   public ResponseEntity delete(@PathVariable int eid){
     Employee employee=repo.findByEid(eid);

     if(employee==null){
         return new ResponseEntity(HttpStatus.NOT_FOUND);
     }

       repo.delete(employee);
     return new ResponseEntity<Object>(HttpStatus.OK);

   }
//Post the details Of the Employee
}
