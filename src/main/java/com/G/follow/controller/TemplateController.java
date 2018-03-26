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
public class TemplateController {
	@Autowired
	ProcedureInterface procedureInterface;

	@RequestMapping(value = "/templateQuery", method = RequestMethod.POST)
	@ResponseBody
	public List query(FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>get</FUNCTIONSUB>")
				.setProcedure("sp_T_SFS_ENTITY").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/templateAdd", method = RequestMethod.POST)
	@ResponseBody
	public List add(String ECODE,String ENAME,String ETYPE,String EDES,String ECREATER,String ECREATETIME,String MADULEID,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>add</FUNCTIONSUB>")
				.append("<ECODE>"+ECODE+"</ECODE>")
				.append("<ENAME>"+ENAME+"</ENAME>")
				.append("<ETYPE>"+ETYPE+"</ETYPE>")
				.append("<EDES>"+EDES+"</EDES>")
				.append("<ECREATER>"+ECREATER+"</ECREATER>")
				.append("<ECREATETIME>"+ECREATETIME+"</ECREATETIME>")
				.append("<MADULEID>"+MADULEID+"</MADULEID>")
				.setProcedure("sp_T_SFS_ENTITY").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/templateUpdate", method = RequestMethod.POST)
	@ResponseBody
	public List update(String ORDROWID,String ECODE,String ENAME,String ETYPE,String EDES,String ECREATER,String ECREATETIME,String MADULEID,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>update</FUNCTIONSUB>")
				.append("<ORDROWID>"+ORDROWID+"</ORDROWID>")
				.append("<ECODE>"+ECODE+"</ECODE>")
				.append("<ENAME>"+ENAME+"</ENAME>")
				.append("<ETYPE>"+ETYPE+"</ETYPE>")
				.append("<EDES>"+EDES+"</EDES>")
				.append("<ECREATER>"+ECREATER+"</ECREATER>")
				.append("<ECREATETIME>"+ECREATETIME+"</ECREATETIME>")
				.append("<MADULEID>"+MADULEID+"</MADULEID>")
				.setProcedure("sp_T_SFS_ENTITY").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/templateDel", method = RequestMethod.POST)
	@ResponseBody
	public List del(String ordrowid,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>del</FUNCTIONSUB>")
				.append("<ORDROWID>"+ordrowid+"</ORDROWID>")
				.setProcedure("sp_T_SFS_ENTITY").excust(procedureInterface);
	}
	

}
