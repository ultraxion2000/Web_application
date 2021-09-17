package com.kursovaya.user;

import com.kursovaya.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setLogin(resultSet.getString("login"));
        user.setPassword(resultSet.getString("password"));

        return user;
    }
}
