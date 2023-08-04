package com.example.multipledatasource.dao;

import com.example.multipledatasource.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl {

    @Autowired
    @Qualifier("jdbcTemplate1")
    private JdbcTemplate jdbcTemplate1;
    @Autowired
    @Qualifier("jdbcTemplate2")
    private JdbcTemplate jdbcTemplate2;

    public List<User> getAllUsers() {
        String sql1 = "SELECT username, email FROM user1";
        UserRowMapper userRowMapper = new UserRowMapper();
        List<User> users = jdbcTemplate1.query(sql1, userRowMapper);
        String sql2 = "SELECT username, email FROM user2";
        users.addAll(jdbcTemplate2.query(sql2, userRowMapper));
        return users;
    }
}
