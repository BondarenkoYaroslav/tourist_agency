package com.bondarenko.agency.service.impl;

import com.bondarenko.agency.dao.EmployeesDAO;
import com.bondarenko.agency.entity.Employees;
import com.bondarenko.agency.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesDAO employeesDAO;

    @Override
    @Transactional
    public List<Employees> getAllEmployees() {
        return employeesDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveOrUpdateEmployee(Employees employee) {
        employeesDAO.saveOrUpdateEmployee(employee);
    }

    @Override
    @Transactional
    public Employees getEmployee(int empId) {
        return employeesDAO.getEmployee(empId);
    }

    @Override
    @Transactional
    public void deleteEmployee(int empId) {
        employeesDAO.deleteEmployee(empId);
    }
}
