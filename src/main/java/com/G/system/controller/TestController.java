package com.G.system.controller;

import com.G.system.dao.RoleMapper;
import com.G.system.dao.UserMapper;
import com.G.system.dao.UserRoleResourcesMapper;
import com.G.system.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserRoleResourcesMapper userRoleResourcesMapper;
    @RequestMapping(value = "/testRole", method = RequestMethod.GET)
    @ResponseBody
    public List query() {
//        return roleMapper.select(new Role());
        User oldUser = new User();
        oldUser.setUserIid("1");
        User newUser = new User();
        newUser.setUserAct("lzptest");
//        userMapper.update(new UpdateParameterUtils(newUser, oldUser));
        return userRoleResourcesMapper.select(oldUser);
    }

}
