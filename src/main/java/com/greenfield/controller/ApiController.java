package com.greenfield.controller;


import com.greenfield.model.User;
import com.greenfield.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired private UserService userService;

    @RequestMapping(value = "/users", produces = "application/json")
    public List<User> getUsers() {
        return userService.getAll();
    }

}
