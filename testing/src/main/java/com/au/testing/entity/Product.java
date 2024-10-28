package com.au.testing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(nullable = false)
    private String EmpName;
 
    @Column(nullable = false)
    private int EmpAge;
 
    @Column(nullable = false)
    private String EmpGender;
    
    @Column(nullable=false, unique=true)
    private String empPanNumber;
    
    @Column(nullable = false)
    private double empPhoneNumber;
    
    @Column(nullable=false)
    private String empEmailAddress;
    
    @Column(nullable=false)
    private String empHomeAddress;
    
    @Column(nullable=false)
    private String empHomeCity;
    
    @Column(nullable=false)
    private int empHomeZipCode;
    
    @Column(nullable=false)
    private String empHomeDOB;
    
    @Column(nullable=false)
    private String empHomeState;
    // Constructors, getters and setters, and other methods...
 
    // Getters
    public Long getId() {
        return id;
    }
 
    public String getName() {
        return EmpName;
    }
 
    public int getAge() {
        return EmpAge;
    }
 
    public String getGender() {
        return EmpGender;
    }
    
    public String getPanNumber() {
        return empPanNumber;
    }
    
    public double getPhoneNumber() {
    	return empPhoneNumber;
    }
    
    public String getEmailAddress() {
    	return empEmailAddress;
    }
    
    public String getEmployeeAddress() {
    	return empHomeAddress;
    }
    
    public String getEmployeeCity() {
    	return empHomeCity;
    }
    
    public int getEmployeeZipCode() {
    	return empHomeZipCode;
    }
    
    public String getEmployeeDOB() {
    	return empHomeDOB;
    }
    
    public String getEmployeeState() {
    	return empHomeState;
    }
 
    // Setters
    public void setId(Long id) {
        this.id = id;
    }
 
    public void setName(String name) {
        this.EmpName = name;
    }
 
    public void setAge(int age) {
        this.EmpAge = age;
    }
 
    public void setGender(String gender) {
        this.EmpGender = gender;
    }
    
    public void setPanNumber(String PanNumber) {
        this.empPanNumber = PanNumber;
    }
    
    public void setPhoneNumber(double phone) {
    	this.empPhoneNumber=phone;
    }
    
    public void setEmailAddress(String email) {
    	this.empEmailAddress=email;
    }
    
    public void setEmployeeAddress(String empaddress) {
    	this.empHomeAddress=empaddress;
    }
    
    public void setEmployeeCity(String empcity) {
    	this.empHomeCity=empcity;
    }
    
    public void setEmployeeZipCode(int empzipcode) {
    	this.empHomeZipCode=empzipcode;
    }
    
    public void setEmployeeState(String empstate) {
    	this.empHomeState=empstate;
    }
    
    public void setEmployeeDOB(String empdob) {
    	this.empHomeDOB=empdob;
    }
}
