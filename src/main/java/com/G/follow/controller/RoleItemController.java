package com.G.follow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.G.follow.dao.ProcedureInterface;
import com.G.follow.potting.FollowModel;
@Controller
public class RoleItemController {
	@Autowired
	ProcedureInterface procedureInterface;
	
	@RequestMapping(value = "/roleItemQuery", method = RequestMethod.POST)
	@ResponseBody
	public List query(FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>get</FUNCTIONSUB>")
				.setProcedure("sp_T_SFS_ROLEITEMS").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/roleItemAdd", method = RequestMethod.POST)
	@ResponseBody
	public List add(String EntityID,String RoleType,String Roledes,String RoleValues,
			String CREATER,String PlanID,String Plandes,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>add</FUNCTIONSUB>")
				.append("<EntityID>" + EntityID + "</EntityID>")
		        .append("<RoleType>" + RoleType + "</RoleType>")
		        .append("<Roledes>" + Roledes + "</Roledes>")
		        .append("<RoleValues>" + RoleValues + "</RoleValues>")
		        .append("<CREATER>" + CREATER + "</CREATER>")
		        .append("<PlanID>"+PlanID+"</PlanID>")
		        .append("<Plandes>"+Plandes+"</Plandes>")
				.setProcedure("sp_T_SFS_ROLEITEMS").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/roleItemUpdate", method = RequestMethod.POST)
	@ResponseBody
	public List update(String RoleItemID,String EntityID,String RoleType,String Roledes,String RoleValues,
			String CREATER,String PlanID,String Plandes,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>add</FUNCTIONSUB>")
				.append("<RoleItemID>" + RoleItemID + "</RoleItemID>")
				.append("<EntityID>" + EntityID + "</EntityID>")
		        .append("<RoleType>" + RoleType + "</RoleType>")
		        .append("<Roledes>" + Roledes + "</Roledes>")
		        .append("<RoleValues>" + RoleValues + "</RoleValues>")
		        .append("<CREATER>" + CREATER + "</CREATER>")
		        .append("<PlanID>"+PlanID+"</PlanID>")
		        .append("<Plandes>"+Plandes+"</Plandes>")
				.setProcedure("sp_T_SFS_ROLEITEMS").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/roleItemDel", method = RequestMethod.POST)
	@ResponseBody
	public List del(String RoleItemID,String PlanID,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>del</FUNCTIONSUB>")
				.append("<RoleItemID>" + RoleItemID + "</RoleItemID>")
				.append("<PlanID>" + PlanID + "</PlanID>")
				.setProcedure("sp_T_SFS_ROLEITEMS").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/roleRuleItemAdd", method = RequestMethod.POST)
	@ResponseBody
	public List ddd(String EntityID,String RoleType,String RoleValues,String Roledes,
			String CREATER,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>addrule</FUNCTIONSUB>")
				.append("<EntityID>" + EntityID + "</EntityID>")
		        .append("<RoleType>" + RoleType + "</RoleType>")
		        .append("<RoleValues>" + RoleValues + "</RoleValues>")
		        .append("<Roledes>" + Roledes + "</Roledes>")
		        .append("<CREATER>" + CREATER + "</CREATER>")
				.setProcedure("sp_T_SFS_ROLEITEMS").excust(procedureInterface);
	}
	

}
