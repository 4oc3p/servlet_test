package com.service;

import com.dao.UserDaoInterface;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by 4oc3p on 26.05.2017. test_servlet
 */
@Service(value = "userService")
public class UserServiceImpl implements UserServiceInterface {

    private UserDaoInterface userDao;

    @Override
    @Autowired
    public void setUserDao(UserDaoInterface userDao) {
        this.userDao = userDao;
    }

    public User findUserByName(String name) {
        for (User user : userDao.getUsers()) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getUsers();
    }
}
