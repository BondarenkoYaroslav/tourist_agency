package com.bondarenko.agency.dao;

import com.bondarenko.agency.entity.Employees;

import java.util.List;

public interface EmployeesDAO {
    public List<Employees> getAllEmployees();

    public void saveOrUpdateEmployee(Employees employee);

    public Employees getEmployee(int empId);

    public void deleteEmployee(int empId);
}
