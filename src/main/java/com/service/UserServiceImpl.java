package com.service;

import com.dao.UserDaoImpl;
import com.dao.UserDaoInterface;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 4oc3p on 26.05.2017. test_servlet
 */
@Service(value = "userService")
public class UserServiceImpl extends HttpServlet implements UserServiceInterface {
    private UserDaoInterface userDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        getAllUsers().forEach(writer::println);
    }

    @Override
    @Autowired
    public void setUserDao(UserDaoInterface userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers(){
        return userDao.getUsers();
    }
}
