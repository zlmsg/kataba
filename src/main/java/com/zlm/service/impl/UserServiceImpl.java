package com.zlm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zlm.dao.UserDao;
import com.zlm.entity.User;
import com.zlm.service.intf.UserService;
import com.zlm.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.orderByDesc("id");
        return userDao.selectList(qw);
    }
}
