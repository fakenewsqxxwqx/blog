package com.example.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    private com.example.blog.mapper.userMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println(userMapper.selectByName("admin"));
    }

}
