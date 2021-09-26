package com.bondarenko.agency.service;

import com.bondarenko.agency.entity.Users;

import java.util.List;

public interface UsersService {
    public List<Users> getAllUsers();

    public void saveOrUpdateUser(Users user);

    public Users getUser(String name);

    public void deleteUser(String name);

    public void setRole(String name);
}
