package com.kursovaya.user;

import com.kursovaya.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    UserDao userDao;

    public User findBy(String login, String password){
        return userDao.findBy(login, password);
    }



}
