package com.dao;

import com.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 4oc3p on 26.05.2017. test_servlet
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDaoInterface {

    private List<User> users = Arrays.asList(
            new User("qwe", 12),
            new User("asd", 16),
            new User("asssd", 17)
    );

    @Override
    public List<User> getUsers() {
        return users;
    }
}
