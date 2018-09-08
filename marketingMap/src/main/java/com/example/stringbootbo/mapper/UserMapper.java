package com.example.stringbootbo.mapper;

import com.example.stringbootbo.bean.User;
import org.springframework.stereotype.Repository;



public interface UserMapper
{
    public User selectById(Integer id);
}
