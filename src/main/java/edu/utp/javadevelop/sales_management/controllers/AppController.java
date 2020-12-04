package edu.utp.javadevelop.sales_management.controllers;

import edu.utp.javadevelop.sales_management.models.Users;
import edu.utp.javadevelop.sales_management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    UserService userService;

    @RequestMapping("hello")
    public String index() {

        return "cami";
    }
}
