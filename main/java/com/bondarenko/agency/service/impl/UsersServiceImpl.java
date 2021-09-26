package com.bondarenko.agency.service.impl;

import com.bondarenko.agency.dao.UsersDAO;
import com.bondarenko.agency.entity.Users;
import com.bondarenko.agency.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDAO usersDAO;

    @Override
    @Transactional
    public List<Users> getAllUsers() {
        return usersDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveOrUpdateUser(Users user) {
        usersDAO.saveOrUpdateUser(user);
    }

    @Override
    @Transactional
    public Users getUser(String name) {
        return usersDAO.getUser(name);
    }

    @Override
    @Transactional
    public void deleteUser(String name) {
        usersDAO.deleteUser(name);
    }

    @Override
    @Transactional
    public void setRole(String name) {
        usersDAO.setRole(name);
    }
}
