package com.controller;

import com.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 4oc3p on 26.05.2017. test_servlet
 */
@Controller(value = "adminController")
@RequestMapping("/users/admins")
public class AdminController {
    private UserServiceInterface adminService;

    @Autowired
    public void setAdminService(UserServiceInterface adminService) {
        this.adminService = adminService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String admins(ModelMap model){
        model.addAttribute("admins", adminService.getAllUsers());
        return "admins";
    }
}
