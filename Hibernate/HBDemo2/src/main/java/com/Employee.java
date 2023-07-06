package com;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

 

@Entity
@Table(name = "MyEmployee")
public class Employee { 

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int uid; 
    @Column(name = "employeeName")
    private String name; 
    @Column(name = "employeeDesig")
    private String desig;
    @Transient
    private String location;

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesig() {
        return desig;
    }
    public void setDesig(String desig) {
        this.desig = desig;
    } 

}