package com.example.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.blog.bean.comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface commentMapper extends BaseMapper<comment> {
}
