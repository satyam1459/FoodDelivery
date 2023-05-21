package com.example.FoodDelivery.controller;

import com.example.FoodDelivery.dto.SignInInput;
import com.example.FoodDelivery.dto.SignInOutput;
import com.example.FoodDelivery.dto.SignUpOutput;
import com.example.FoodDelivery.model.User;
import com.example.FoodDelivery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public SignUpOutput signUp(@Valid @RequestBody User signUpInput){
        return userService.signUp(signUpInput);
    }

    @PostMapping("/signin")
    public SignInOutput signIn(@Valid @RequestBody SignInInput signInInput){
        return userService.signIn(signInInput);
    }
}
