package com.zlm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zlm.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseMapper<User> {
}
