package com.media.social.controller;

import com.media.social.model.RoleType;
import com.media.social.model.User;
import com.media.social.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @Autowired
    private UserServiceImpl userService;


    @GetMapping("/")
    public String goHome(){
        return "Hello guys!!!";
    }

    @GetMapping("/home")
    public String home(){

        return "Welcome to home page";
    }


    @PostMapping("/user/register")
    public User userRegistration(@RequestBody User user){

        user.setRole(RoleType.USER);
        log.info(user.toString());
        return userService.save(user);
    }

    @PostMapping("/admin/register")
    public User adminRegistration(@RequestBody User user){

        user.setRole(RoleType.SUPER_ADMIN);

        log.info(user.toString());
        return userService.save(user);
    }


}
