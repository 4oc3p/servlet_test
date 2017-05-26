package com.controller;

import com.model.User;
import com.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 4oc3p on 26.05.2017. test_servlet
 */
@Controller(value = "userController")
@RequestMapping("/users")
public class UserController {
    private UserServiceInterface userService;

    @Autowired
    public void setUserService(UserServiceInterface userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String printUsers(ModelMap model){
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String getUser(@RequestParam(value = "user") String userName, ModelMap model){
        User user = userService.findUserByName(userName);
        model.addAttribute("foundUser", user);
        return "users";
    }
}
