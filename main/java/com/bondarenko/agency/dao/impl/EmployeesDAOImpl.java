package com.bondarenko.agency.dao.impl;

import com.bondarenko.agency.dao.EmployeesDAO;
import com.bondarenko.agency.entity.Employees;
import com.bondarenko.agency.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeesDAOImpl implements EmployeesDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employees> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        List<Employees> empList = session.createQuery("from Employees", Employees.class).getResultList();

        return empList;
    }

    @Override
    public void saveOrUpdateEmployee(Employees employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public Employees getEmployee(int empId) {
        Session session = sessionFactory.getCurrentSession();
        Employees employee = session.get(Employees.class, empId);

        return employee;
    }

    @Override
    public void deleteEmployee(int empId) {
        Session session = sessionFactory.getCurrentSession();
        Query<Users> query = session.createQuery("delete from Employees " +
                "where empId =:empId");
        query.setParameter("empId", empId);
        query.executeUpdate();
    }
}
