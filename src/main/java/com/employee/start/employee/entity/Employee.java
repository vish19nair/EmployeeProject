package com.employee.start.employee.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.engine.internal.Cascade;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="EMPLOYEE")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="EMPID")
private Integer eid;
@Column(name="EMPNAME")
private String empname;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="DESGNID")
@JsonIgnore
Designation designation;


    @Transient
private String Jobtitle;

    @OneToMany
 @JsonIgnoreProperties(value =  {"subordinate"})
  @JoinColumn(name="MANAGERID")
    List<Employee> subordinate;


   @OneToOne
   @JoinColumn(name="MANAGERID")
   Employee manager;

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }



    public void setJobtitle(String jobtitle) {
        Jobtitle = jobtitle;
    }
    public String getJobtitle() {
        return this.designation.getDesignation();
    }

    public List<Employee> getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(List<Employee> subordinate) {
        this.subordinate = subordinate;
    }
}
