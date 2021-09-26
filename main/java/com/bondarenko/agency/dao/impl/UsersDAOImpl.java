package com.bondarenko.agency.dao.impl;

import com.bondarenko.agency.dao.UsersDAO;
import com.bondarenko.agency.entity.Authorities;
import com.bondarenko.agency.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersDAOImpl implements UsersDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Users> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        List<Users> listUsers = session.createQuery("from Users", Users.class).getResultList();
        
        return listUsers;
    }

    @Override
    public void saveOrUpdateUser(Users user) {
        Session session = sessionFactory.getCurrentSession();

//        create ConfigEncryption, add ConfigSecurity logic
        if (!user.getPassword().contains("{bcrypt}") && !user.getPassword().contains("{noop}")) {
            user.setPassword("{bcrypt}" + new BCryptPasswordEncoder().encode(user.getPassword()));
        }
        session.saveOrUpdate(user);
    }

    @Override
    public Users getUser(String name) {
        Session session = sessionFactory.getCurrentSession();
        Users user;
        user = session.get(Users.class, name);

        return user;
    }

    @Override
    public void deleteUser(String name) {
        Session session = sessionFactory.getCurrentSession();
        Query<Users> query = session.createQuery("delete from Users " +
                "where username =:username");
        query.setParameter("username", name);
        query.executeUpdate();
    }

//    create ENUM for roles
    @Override
    public void setRole(String name) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(new Authorities(name, "ROLE_USER"));
    }
}
