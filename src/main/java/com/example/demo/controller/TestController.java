package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.UserRequest;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@RestController
public class TestController {

    @Autowired
    UserService userService;
    private List<User> userList = new ArrayList<>();

    private static final Logger logger = Logger.getLogger(TestController.class.getName());
    @GetMapping("/hello")
    public String test() {
        return "Hello World!";
    }

    @PostMapping("/submit")
    public String submit(@RequestBody UserRequest userRequest) {
        userService.saveUser();
        return "Message is Submitted!";
    }

    @GetMapping("/getUser/{id}")
    public Object getUser(@PathVariable String id){
        User userFound = getUserById(id);

        return userFound == null ? "User not found" : userFound;

    }

    @PostMapping("/addUser")
    public Object addUser(@RequestBody User user){
        userList.add(user);
        for (User userEach : userList) {
            System.out.println(userEach.getName() + " " + userEach.getId());
        }
        return "User has been added";

    }

    public User getUserById(String id) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null; // Return null if user not found
    }

}
