package com.example.blog.controller;


import com.example.blog.dto.request.loginRequest;
import com.example.blog.dto.request.regRequest;
import com.example.blog.dto.response.loginResponse;
import com.example.blog.dto.response.regResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userController {

    @PostMapping("/login")
    public loginResponse login(@RequestBody loginRequest loginRequest) {
        loginResponse loginResponse = new loginResponse();
        loginResponse.setSuccess(false);
        loginResponse.setFailReason("用户名或密码错误");
        return loginResponse;
    }

    @PostMapping("/register")
    public regResponse register(@RequestBody regRequest regRequest) {
        regResponse regResponse = new regResponse();
        regResponse.setSuccess(false);
        regResponse.setFailReason("用户名已存在");
        return regResponse;
    }

    @PutMapping("/changeProfile")
    public String changeProfile() {
        return "changeProfile";
    }

    @GetMapping("/getUserProfile")
    public String getUserProfile() {
        return "getUserProfile";
    }
}
