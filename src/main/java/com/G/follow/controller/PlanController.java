package com.G.follow.controller;

import com.G.follow.dao.ProcedureInterface;
import com.G.follow.potting.FollowModel;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class PlanController {
    @Autowired
    ProcedureInterface procedureInterface;

    @RequestMapping(value = "/planQuery", method = RequestMethod.POST)
    @ResponseBody
    public List query(String PATID, FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>get</FUNCTIONSUB>")
                .append("<PATID>" + PATID + "</PATID>")
                .setProcedure("sp_T_SFS_PLAN")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/planAdd", method = RequestMethod.POST)
    @ResponseBody
    public List add(String PlanName,
                    String Plandes,
                    String Ecreater,
                    String RoleItemID
            , FollowModel followModel) {
        followModel.append("<FUNCTIONSUB>add</FUNCTIONSUB>")
                .append("<PlanName>" + PlanName + "</PlanName>")
                .append("<Plandes>" + Plandes + "</Plandes>")
                .append("<creater>" + Ecreater + "</creater>");

        JSONArray RoleItemIDList = JSONArray.fromObject(RoleItemID);
        for (int i = 0; i < RoleItemIDList.size(); i++) {
            JSONObject obj = RoleItemIDList.getJSONObject(i);
            String RoleItemIDS = obj.getString("RoleItemID");
            followModel.append("<ITEMS>")
                    .append("<RoleItemID>" + RoleItemIDS + "</RoleItemID>")
                    .append("<Plandes>" + PlanName + "</Plandes>")
                    .append("<creater>" + Ecreater + "</creater></ITEMS>");
        }
        return followModel.setProcedure("sp_T_SFS_PLAN_DETAIL")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/planAddRole", method = RequestMethod.POST)
    @ResponseBody
    public List addRole(String PlanID,
                        String Plandes,
                        String RoleItemID,
                        String Ecreater
            , FollowModel followModel) {
        followModel.append("<FUNCTIONSUB>addRole</FUNCTIONSUB>");
        JSONArray RoleItemIDList = JSONArray.fromObject(RoleItemID);
        for (int i = 0; i < RoleItemIDList.size(); i++) {
            JSONObject obj = RoleItemIDList.getJSONObject(i);
            String RoleItemIDS = obj.getString("RoleItemID");
            followModel.append("<ITEMS><PlanID>" + PlanID + "</PlanID>")
                    .append("<RoleItemID>" + RoleItemIDS + "</RoleItemID>")
                    .append("<Plandes>" + Plandes + "</Plandes>")
                    .append("<creater>" + Ecreater + "</creater></ITEMS>");
        }
        return followModel.setProcedure("sp_T_SFS_PLAN")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/planUpdate", method = RequestMethod.POST)
    @ResponseBody
    public List update(String ecreater,
                       String QandAData,
                       String TemplateID
            , FollowModel followModel) {
        JSONArray TemplateList = JSONArray.fromObject(QandAData);
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat();
        dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");
        // 带参构造
        String time2 = dateFormat.format(date);
        followModel.append("<FUNCTIONSUB>update</FUNCTIONSUB>")
                .append("<TemplateID>" + TemplateID + "</TemplateID>");
        for (int i = 0; i < TemplateList.size(); i++) {
            JSONObject obj = TemplateList.getJSONObject(i);
            String questionID = obj.getString("questionID");
            followModel.append("<ITEMS><ORDROWID>" + questionID + "</ORDROWID>");
            String answer = obj.getString("answer");
            followModel.append("<TemplateID>" + TemplateID + "</TemplateID>")
                    .append("<ECREATER>" + ecreater + "</ECREATER>")
                    .append("<ITEMNAME>" + answer + "</ITEMNAME>")
                    .append("<createtime>" + time2 + "</createtime>");
            String answerID = obj.getString("answerID");
            followModel.append("<ITEMORDROWID>" + answerID + "</ITEMORDROWID></ITEMS>");
        }
        return followModel.setProcedure("sp_T_SFS_PLAN")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/planDel", method = RequestMethod.POST)
    @ResponseBody
    public List del(String type,
                    String ordrowid
            , FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>del</FUNCTIONSUB>")
                .append("<ORDROWID>" + ordrowid + "</ORDROWID>")
                .setProcedure("sp_T_SFS_PLAN")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/planItemDel", method = RequestMethod.POST)
    @ResponseBody
    public List itemDel(String RoleItemID,
                        String PlanID
            , FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>delRole</FUNCTIONSUB>")
                .append("<RoleItemID>" + RoleItemID + "</RoleItemID>")
                .append("<PlanID>" + PlanID + "</PlanID>")
                .setProcedure("sp_T_SFS_PLAN")
                .excust(procedureInterface);
    }

}
