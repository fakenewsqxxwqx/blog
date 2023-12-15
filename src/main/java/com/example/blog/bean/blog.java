package com.example.blog.bean;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class blog {
        private int id;
        private String title;
        private String content;
        private int userId;
        private LocalDateTime createtime;
        private LocalDateTime updatetime;
        private boolean del;

}
