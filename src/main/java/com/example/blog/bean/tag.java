package com.example.blog.bean;

import lombok.Data;

@Data
public class tag {
    private int id;
    private String name;
    private int blogId;
    private boolean del;
}
