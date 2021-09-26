package com.bondarenko.agency.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int empId;

    @Column(name = "employee_name")
    private String empName;

    @Column(name = "employee_surname")
    private String empSurname;

    @Column(name = "employee_birthday")
    private Date empBirthday;

    @Column(name = "employee_salary")
    private int empSalary;

    @Column(name = "employee_position")
    private String empPosition;

    @Column(name = "employee_address")
    private String empAddress;

    @Column(name = "employee_phone")
    private String empPhone;

    public Employees() {
    }

    public Employees(int empId, String empName, String empSurname, Date empBirthday, int empSalary, String empPosition, String empAddress, String empPhone) {
        this.empId = empId;
        this.empName = empName;
        this.empSurname = empSurname;
        this.empBirthday = empBirthday;
        this.empSalary = empSalary;
        this.empPosition = empPosition;
        this.empAddress = empAddress;
        this.empPhone = empPhone;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public Date getEmpBirthday() {
        return empBirthday;
    }

    public void setEmpBirthday(Date empBirthday) {
        this.empBirthday = empBirthday;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSurname='" + empSurname + '\'' +
                ", empBirthday=" + empBirthday +
                ", empSalary=" + empSalary +
                ", empPosition='" + empPosition + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empPhone='" + empPhone + '\'' +
                '}';
    }
}
