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
public class MainController {
    @Autowired
    ProcedureInterface procedureInterface;

    @RequestMapping(value = "/mainQuery", method = RequestMethod.POST)
    @ResponseBody
    public List query(String ROLEID
            , FollowModel followModel) {
        return followModel.append("<ROLEID>" + ROLEID + "</ROLEID>")
                .append("<FUNCTIONSUB>GetUserFlup</FUNCTIONSUB>")
                .setProcedure("sp_T_SFS_ROLE")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/mainAdd", method = RequestMethod.POST)
    @ResponseBody
    public List add(String ITEMS,
                    String ORDROWID
            , FollowModel followModel) {
        followModel.append("<FUNCTIONSUB>USEadd</FUNCTIONSUB>")
                .append("<ROLEID>" + ORDROWID + "</ROLEID>");
        JSONArray ITEMList = JSONArray.fromObject(ITEMS);
        for (int i = 0; i < ITEMList.size(); i++) {
            JSONObject obj = ITEMList.getJSONObject(i);
            String DetailID = obj.getString("DETAILID");
            String PICI = obj.getString("PICI");
            String MainID = obj.getString("MAINID");
            String MainNAME = obj.getString("MAINNAME");
            String QuestionID = obj.getString("questionid");
            String QuestionName = obj.getString("questionname");
            String ItemID = obj.getString("itemid");
            String ItemName = obj.getString("itemname");
            String PatID = obj.getString("PATID");
            String USETYPE = obj.getString("USETYPE");
            followModel.append("<ITEMS><ORDROWID>" + DetailID + "</ORDROWID>")
                    .append("<PICI>" + PICI + "</PICI>")
                    .append("<MAINID>" + MainID + "</MAINID>")
                    .append("<MAINNAME>" + MainNAME + "</MAINNAME>")
                    .append("<PATID>" + PatID + "</PATID>")
                    .append("<QUESTIONID>" + QuestionID + "</QUESTIONID>")
                    .append("<QUESTIONNAME>" + QuestionName + "</QUESTIONNAME>")
                    .append("<ITEMID>" + ItemID + "</ITEMID>")
                    .append("<ITEMVALUE>" + ItemName + "</ITEMVALUE>")
                    .append("<USETYPE>" + USETYPE + "</USETYPE></ITEMS>");
        }
        return followModel.setProcedure("sp_T_SFS_DETAIL")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/mainUpdate", method = RequestMethod.POST)
    @ResponseBody
    public List update(String ecreater,
                       String QandAData,
                       String TemplateID
            , FollowModel followModel) {
        JSONArray TemplateList = JSONArray.fromObject(QandAData);
        Date date = new Date();
        System.out.println(date);
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
        return followModel.setProcedure("sp_T_SFS_MAIN")
                .excust(procedureInterface);
    }

    @RequestMapping(value = "/mainDel", method = RequestMethod.POST)
    @ResponseBody
    public List del(String ordrowid
            , FollowModel followModel) {
        return followModel.append("<FUNCTIONSUB>del</FUNCTIONSUB>")
                .append("<ORDROWID>" + ordrowid + "</ORDROWID>")
                .setProcedure("sp_T_SFS_MAIN")
                .excust(procedureInterface);
    }

}
