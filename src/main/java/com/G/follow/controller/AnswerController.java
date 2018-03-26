package com.G.follow.controller;

import com.G.follow.dao.ProcedureInterface;
import com.G.follow.potting.FollowModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AnswerController {
    @Autowired
    ProcedureInterface procedureInterface;

    @RequestMapping(value = "/answerQuery", method = RequestMethod.POST)
    @ResponseBody
    public List query(String ordrowid
            , FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>get</FUNCTIONSUB>")
                .append("<ORDROWID>" + ordrowid + "</ORDROWID>")
                .setProcedure("sp_T_SFS_ITEM")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/answerAdd", method = RequestMethod.POST)
    @ResponseBody
    public List add(String item,
                          String itemType,
                          String itemDetail,
                          String Ecreater
            , FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>add</FUNCTIONSUB>")
                .append("<ITEMNAME>" + item + "</ITEMNAME>")
                .append("<ITEMCORE>1</ITEMCORE>")
                .append("<ITEMTYPE>" + itemType + "</ITEMTYPE>")
                .append("<ITEMDES>" + itemDetail + "</ITEMDES>")
                .append("<suserID>" + Ecreater + "</suserID>")
                .setProcedure("sp_T_SFS_ITEM")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/answerUpdate", method = RequestMethod.POST)
    @ResponseBody
    public List update(String ordrowid,
                             String ITEMNAME,
                             String ITEMDES
            , FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>update</FUNCTIONSUB>")
                .append("<ORDROWID>" + ordrowid + "</ORDROWID>")
                .append("<ITEMNAME>" + ITEMNAME + "</ITEMNAME>")
                .append("<ITEMDES>" + ITEMDES + "</ITEMDES>")
                .setProcedure("sp_T_SFS_ITEM")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/answerDel", method = RequestMethod.POST)
    @ResponseBody
    public List del(String ordrowid
            , FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>del</FUNCTIONSUB>")
                .append("<ORDROWID>" + ordrowid + "</ORDROWID>")
                .setProcedure("sp_T_SFS_ITEM")
                .excust(procedureInterface);
    }

}
