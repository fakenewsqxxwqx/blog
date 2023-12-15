package com.example.blog.mapper;

import com.example.blog.bean.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper extends BaseMapper<user>{
    user selectByName(String username);
}
