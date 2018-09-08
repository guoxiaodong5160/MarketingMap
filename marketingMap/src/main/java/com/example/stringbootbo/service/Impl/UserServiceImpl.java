package com.example.stringbootbo.service.Impl;

import com.example.stringbootbo.bean.User;
import com.example.stringbootbo.mapper.UserMapper;
import com.example.stringbootbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User selectById(Integer id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
