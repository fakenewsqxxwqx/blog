package com.example.blog.dto.request;

import lombok.Data;

@Data
public class regRequest {
    private String username;
    private String password;
    private String email;
    private String photo;
}
