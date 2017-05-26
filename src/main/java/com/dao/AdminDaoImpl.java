package com.dao;

import com.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 4oc3p on 26.05.2017. test_servlet
 */
@Repository(value = "adminDao")
public class AdminDaoImpl implements UserDaoInterface {

    private List<User> admins = Arrays.asList(
            new User("admin", 26),
            new User("admin2", 28));

    @Override
    public List<User> getUsers() {
        return admins;
    }
}
