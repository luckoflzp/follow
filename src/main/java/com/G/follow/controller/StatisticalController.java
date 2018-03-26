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
public class StatisticalController {
	@Autowired
	ProcedureInterface procedureInterface;
	
	@RequestMapping(value = "/statisticalQuery", method = RequestMethod.POST)
	@ResponseBody
	public List query(String VisitType,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>" + VisitType + "</FUNCTIONSUB>")
				.setProcedure("sp_T_SFS_ROLE").excust(procedureInterface);
	}

}
