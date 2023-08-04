package com.example.multipledatasource.controller;

import com.example.multipledatasource.dao.UserDaoImpl;
import com.example.multipledatasource.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDaoImpl userDao;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            users = userDao.getAllUsers();
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(users, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
