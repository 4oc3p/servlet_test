package com.service;

import com.dao.UserDaoInterface;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 4oc3p on 26.05.2017. test_servlet
 */
@Service(value = "adminService")
public class AdminServiceImpl implements UserServiceInterface {
    private UserDaoInterface adminDao;

    @Override
    @Autowired
    public void setUserDao(UserDaoInterface adminDao) {
        this.adminDao = adminDao;
    }

    @Override
    public User findUserByName(String name) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return adminDao.getUsers();
    }
}
