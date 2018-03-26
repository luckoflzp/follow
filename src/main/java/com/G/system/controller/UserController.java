package com.G.system.controller;

import com.G.system.dao.UserMapper;
import com.G.system.model.User;
import com.G.system.potting.UIModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/")
    private UIModel in(UIModel uiModel){
        return uiModel.put("user",new User()).setTitleAndUrl("登入","system/login");
    }
    @Autowired
    UserMapper userMapper;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public UIModel index(UIModel uiModel){
        return uiModel.put("user",new User()).setTitleAndUrl("登入","system/login");
    }

    @RequestMapping(value = "/system/index",method = RequestMethod.GET)
    public String index(){
        return "system/index";
    }

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public UIModel login(User user, UIModel uiModel){
        uiModel.put("user",user);
        if(user.getUserAct() == null || user.getUserPsd() == null || user.getUserAct().trim().length() == 0 || user.getUserPsd().trim().length() == 0){
            return uiModel.setTitleAndUrl("登入","system/login");
        }else{
            List<?> list = userMapper.select(user);
            if(list.size() == 1){
                return uiModel.put("user",list.get(0)).setTitleAndUrl("首页","system/backstage").setHtml("system/usersList");
            }else{
                return uiModel.setTitleAndUrl("登入","system/login");
            }
        }
    }
}
