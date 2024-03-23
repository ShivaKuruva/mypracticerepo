package com.shiva.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping(value="/{userId}")
    public User getUser(@PathVariable("userId") String userId){
        User userOne = new User(userId, "User Name-"+userId,"xxxxxx-"+userId);
        return  userOne;
    }
}
