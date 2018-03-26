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
public class ResultController {
    @Autowired
    ProcedureInterface procedureInterface;

    @RequestMapping(value = "/resultQuery", method = RequestMethod.POST)
    @ResponseBody
    public List query(FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>get</FUNCTIONSUB>")
                .setProcedure("sp_T_SFS_DETAIL")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/resultAdd", method = RequestMethod.POST)
    @ResponseBody
    public List add(String MAINID,
                    String MIANNAME,
                    String QUESTIONID,
                    String QUESTIONNAME,
                    String ITEMID,
                    String ITEMVALUE,
                    String USETYPE,
                    FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>add</FUNCTIONSUB>")
                .append("<MAINID>" + MAINID + "</MAINID>")
                .append("<MIANNAME>" + MIANNAME + "</MIANNAME>")
                .append("<QUESTIONID>" + QUESTIONID + "</QUESTIONID>")
                .append("<QUESTIONNAME>" + QUESTIONNAME + "</QUESTIONNAME>")
                .append("<ITEMID>" + ITEMID + "</ITEMID>")
                .append("<ITEMVALUE>" + ITEMVALUE + "</ITEMVALUE>")
                .append("<USETYPE>" + USETYPE + "</USETYPE>")
                .setProcedure("sp_T_SFS_ITEM")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/resultUpdate", method = RequestMethod.POST)
    @ResponseBody
    public List update(String ORDROWID,
                       String MAINID,
                       String MIANNAME,
                       String QUESTIONID,
                       String QUESTIONNAME,
                       String ITEMID,
                       String ITEMVALUE,
                       String USETYPE,
                       FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>update</FUNCTIONSUB>")
                .append("<ORDROWID>" + ORDROWID + "</ORDROWID>")
                .append("<MAINID>" + MAINID + "</MAINID>")
                .append("<MIANNAME>" + MIANNAME + "</MIANNAME>")
                .append("<QUESTIONID>" + QUESTIONID + "</QUESTIONID>")
                .append("<QUESTIONNAME>" + QUESTIONNAME + "</QUESTIONNAME>")
                .append("<ITEMID>" + ITEMID + "</ITEMID>")
                .append("<ITEMVALUE>" + ITEMVALUE + "</ITEMVALUE>")
                .append("<USETYPE>" + USETYPE + "</USETYPE>")
                .setProcedure("sp_T_SFS_ITEM")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/resultDel", method = RequestMethod.POST)
    @ResponseBody
    public List del(String ORDROWID,
                    FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>del</FUNCTIONSUB>")
                .append("<ORDROWID>" + ORDROWID + "</ORDROWID>")
                .setProcedure("sp_T_SFS_ITEM")
                .excust(procedureInterface);
    }
}
