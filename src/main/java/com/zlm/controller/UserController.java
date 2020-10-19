package com.zlm.controller;

import com.zlm.entity.User;
import com.zlm.service.intf.UserService;
import com.zlm.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kataba/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("findAll.do")
    public R<User> findAll(){
        return R.ok(userService.findAll());
    }

}
