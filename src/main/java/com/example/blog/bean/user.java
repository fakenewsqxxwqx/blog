package com.example.blog.bean;


import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
public class user {
        private int id;
        private String username;
        private String password;
        private String email;
        private String photo;
        private boolean isadmin;
        private LocalDateTime createtime;
        private LocalDateTime updatetime;
        private boolean del;
}
