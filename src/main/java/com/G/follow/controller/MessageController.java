package com.G.follow.controller;

import com.G.follow.dao.ProcedureInterface;
import com.G.follow.potting.FollowModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MessageController {
    @Autowired
    ProcedureInterface procedureInterface;

    @RequestMapping(value = "/messageQuery", method = RequestMethod.POST)
    @ResponseBody
    public List query(FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>get</FUNCTIONSUB>")
                .setProcedure("SP_SFS_MESSAGE")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/messageAdd", method = RequestMethod.POST)
    @ResponseBody
    public List add(String MESSAGE,
                    String CREATER,
                    String CREATETIME
            , FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>add</FUNCTIONSUB>")
                .append("<MESSAGE>" + MESSAGE + "</MESSAGE>")
                .append("<CREATER>" + CREATER + "</CREATER>")
                .append("<CREATETIME>" + CREATETIME + "</CREATETIME>")
                .setProcedure("SP_SFS_MESSAGE")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/messageUpdate", method = RequestMethod.POST)
    @ResponseBody
    public List update(String ORDROWID,
                       String MESSAGE,
                       String CREATER,
                       String CREATETIME
            , FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>update</FUNCTIONSUB>")
                .append("<ORDROWID>" + ORDROWID + "</ORDROWID>")
                .append("<MESSAGE>" + MESSAGE + "</MESSAGE>")
                .append("<CREATER>" + CREATER + "</CREATER>")
                .append("<CREATETIME>" + CREATETIME + "</CREATETIME>")
                .setProcedure("SP_SFS_MESSAGE")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/messageDel", method = RequestMethod.POST)
    @ResponseBody
    public List del(String ORDROWID
            , FollowModel followModel) {
        return followModel.append("<ORDROWID>" + ORDROWID + "</ORDROWID>")
                .append("<FUNCTIONSUB>del</FUNCTIONSUB>")
                .setProcedure("SP_SFS_MESSAGE")
                .excust(procedureInterface);
    }

}
