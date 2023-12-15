package com.example.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.example.blog.bean.blog;

@Mapper
public interface blogMapper extends BaseMapper<blog> {
}
