package com.service;

import com.dao.UserDaoInterface;
import com.model.User;

import java.util.List;

/**
 * Created by 4oc3p on 26.05.2017. test_servlet
 */
public interface UserServiceInterface {

    void setUserDao(UserDaoInterface userDao);

    List<User> getAllUsers();
}
