package com.kursovaya.user;

import com.kursovaya.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {

    public final JdbcTemplate jdbcTemplate;


    @Autowired
    public UserDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    public User findBy(String login, String password){
        String sql = "SELECT * FROM user WHERE login = ? AND password = ?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), login, password);
    }



}
