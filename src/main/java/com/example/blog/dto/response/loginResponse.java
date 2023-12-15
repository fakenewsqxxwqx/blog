package com.example.blog.dto.response;

import lombok.Data;

@Data
public class loginResponse {
    private boolean success;
    private String failReason;
}
