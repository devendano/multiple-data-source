package com.example.multipledatasource.service;

import com.example.multipledatasource.dao.UserDaoImpl;
import com.example.multipledatasource.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDaoImpl userDao;

    public List<User> getAllUser() {
        return userDao.getAllUsers();
    }
}
