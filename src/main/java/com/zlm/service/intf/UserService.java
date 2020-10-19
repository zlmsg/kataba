package com.zlm.service.intf;

import com.zlm.entity.User;
import com.zlm.vo.R;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
