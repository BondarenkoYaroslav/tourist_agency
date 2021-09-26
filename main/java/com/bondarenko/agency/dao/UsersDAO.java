package com.bondarenko.agency.dao;

import com.bondarenko.agency.entity.Users;

import java.util.List;

public interface UsersDAO {
    public List<Users> getAllUsers();

    public void saveOrUpdateUser(Users user);

    public Users getUser(String name);

    public void deleteUser(String name);

    public void setRole(String name);
}
