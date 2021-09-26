package com.bondarenko.agency.service;

import com.bondarenko.agency.entity.Employees;

import java.util.List;

public interface EmployeesService {
    public List<Employees> getAllEmployees();

    public void saveOrUpdateEmployee(Employees employee);

    public Employees getEmployee(int empId);

    public void deleteEmployee(int empId);
}
