package com.G.follow.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.G.follow.dao.ProcedureInterface;
import com.G.follow.potting.FollowModel;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class RoleController {
	@Autowired
	ProcedureInterface procedureInterface;

	@RequestMapping(value = "/roleQuery", method = RequestMethod.POST)
	@ResponseBody
	public List query(String PATID,String ECREATER,String ORDWORID,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>get</FUNCTIONSUB>")
				.append("<PATID>"+PATID+"</PATID>")
				.append("<ECREATER>" + ECREATER + "</ECREATER>")
				.append("<ORDROWID>" + ORDWORID + "</ORDROWID>")
				.setProcedure("sp_T_SFS_ROLE").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/roleAdd", method = RequestMethod.POST)
	@ResponseBody
	public List add(String PATID,String CYCLETIME,String PlanID,String ORDROWID,String ECREATER,
			String SFTITLE,String SFDESC,String ROLETYPE,FollowModel followModel) {
		JSONArray PatIDList = JSONArray.fromObject(PATID);
		String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
		followModel.append("<FUNCTIONSUB>add</FUNCTIONSUB>");
		for (int i = 0; i < PatIDList.size(); i++) {
			JSONObject obj = PatIDList.getJSONObject(i);
			followModel.append("<ITEMS><CYCLETIME>" + CYCLETIME + "</CYCLETIME>")
			.append("<PlanID>" + PlanID + "</PlanID>")
			.append("<PATID>" + ORDROWID + "</PATID>")
			.append("<ECREATER>" + ECREATER + "</ECREATER>")
			.append("<SFTITLE>" + SFTITLE + "</SFTITLE>")
			.append("<SFDESC>" + SFDESC + "</SFDESC>")
			.append("<ROLETYPE>" + ROLETYPE + "</ROLETYPE>")
			.append("<VERIFYCODE>" + verifyCode + "</VERIFYCODE>")
			.append("<DOPEOPLE>" + ECREATER + "</DOPEOPLE></ITEMS>");
		}
		return followModel.setProcedure("sp_T_SFS_ROLE").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/roleUpdate", method = RequestMethod.POST)
	@ResponseBody
	public List update(String CYCLETIME,String ORDROWID,String PLANID,
			String SFTITLE,String SFDESC,String SFSTATUS,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>update</FUNCTIONSUB>")
				.append("<CYCLETIME>" + CYCLETIME + "</CYCLETIME>")        
		        .append("<ORDROWID>" + ORDROWID + "</ORDROWID>")        
		        .append("<PLANID>" + PLANID + "</PLANID>")        
		        .append("<SFTITLE>" + SFTITLE + "</SFTITLE>")        
		        .append("<SFDESC>" + SFDESC + "</SFDESC>")        
		        .append("<SFSTATUS>" + SFSTATUS + "</SFSTATUS>")        
				.setProcedure("sp_T_SFS_ROLE").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/roleDel", method = RequestMethod.POST)
	@ResponseBody
	public List del(String ORDROWID,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>update</FUNCTIONSUB>")       
		        .append("<ORDROWID>" + ORDROWID + "</ORDROWID>")        
				.setProcedure("sp_T_SFS_ROLE").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/dOrole", method = RequestMethod.POST)
	@ResponseBody
	public List orole(String CYCLETIME,String SFANYLISE,String SFREST,
			String SFSUGGEST,String NEXTORDROWID,String THISORDROWID,
			String NEXTNEWORDROWID,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>DOROLE</FUNCTIONSUB>")                  
		             .append("<CYCLETIME>" + CYCLETIME + "</CYCLETIME>")                  
		             .append("<SFANYLISE>" + SFANYLISE + "</SFANYLISE>")                  
		             .append("<SFREST>" + SFREST + "</SFREST>")                  
		             .append("<SFSUGGEST>" + SFSUGGEST + "</SFSUGGEST>")                  
		             .append("<NEXTORDROWID>" + NEXTORDROWID + "</NEXTORDROWID>")                  
                     .append("<THISORDROWID>" + THISORDROWID + "</THISORDROWID>")                  	                  .append("<NEXTNEWORDROWID>" + NEXTNEWORDROWID + "</NEXTNEWORDROWID>")                         
				.setProcedure("sp_T_SFS_ROLE").excust(procedureInterface);
	}

}
