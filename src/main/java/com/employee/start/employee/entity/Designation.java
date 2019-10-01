package com.employee.start.employee.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="DESIGNATION")
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @JsonIgnore
    private Integer desgnid;

    @Column(name="designation")
    private  String designation;

    @Column(name="level")
    @JsonIgnore
    private Float level;

    public Integer getDesgnid() {
        return desgnid;
    }

    public void setDesgnid(Integer desgnid) {
        this.desgnid = desgnid;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Float getLevel() {
        return level;
    }

    public void setLevel( Float level) {
        this.level = level;
    }
}
