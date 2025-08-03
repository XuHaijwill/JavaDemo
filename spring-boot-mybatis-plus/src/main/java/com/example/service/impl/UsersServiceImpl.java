package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.DO.UsersDO;
import com.example.mapper.UsersMapper;
import com.example.service.UsersService;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, UsersDO> implements UsersService {

}