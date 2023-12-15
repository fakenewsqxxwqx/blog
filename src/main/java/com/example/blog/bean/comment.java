package com.example.blog.bean;

import lombok.Data;

@Data
public class comment {
    private int id;
    private String content;
    private int userId;
    private int blogId;
    private String createtime;
    private boolean del;
}
