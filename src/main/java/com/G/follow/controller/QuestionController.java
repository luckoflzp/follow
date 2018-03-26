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
public class QuestionController {
	@Autowired
	ProcedureInterface procedureInterface;

	@RequestMapping(value = "/questionQuery", method = RequestMethod.POST)
	@ResponseBody
	public List query(String ordrowid,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>get</FUNCTIONSUB>")
				.append("<ORDROWID>"+ordrowid+"</ORDROWID>")
				.setProcedure("sp_T_SFS_QUESTION").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/questionAdd", method = RequestMethod.POST)
	@ResponseBody
	public List add(String ordrowid,String QNAME,String QTYPE,String QDetail,
			String suserID,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>add</FUNCTIONSUB>")
				.append("<QNAME>" + QNAME + "</QNAME>")
				.append("<QTYPE>" + QTYPE + "</QTYPE>")
				.append("<QEXPLAIN>" + QDetail + "</QEXPLAIN>")
				.append("<suserID>" + suserID + "</suserID>")
				.setProcedure("sp_T_SFS_QUESTION").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/questionUpdate", method = RequestMethod.POST)
	@ResponseBody
	public List update(String ordrowid,String QNAME,String ITEMDES,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>update</FUNCTIONSUB>")
				.append("<QNAME>" + QNAME + "</QNAME>")
				.append("<ITEMDES>" + ITEMDES + "</ITEMDES>")
				.setProcedure("sp_T_SFS_QUESTION").excust(procedureInterface);
	}
	@RequestMapping(value = "/questionDel", method = RequestMethod.POST)
	@ResponseBody
	public List del(String ordrowid,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>del</FUNCTIONSUB>")
				.append("<ORDROWID>"+ordrowid+"</ORDROWID>")
				.setProcedure("sp_T_SFS_QUESTION").excust(procedureInterface);
	}

}
