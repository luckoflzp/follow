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
public class OutpatientController {
	@Autowired
	ProcedureInterface procedureInterface;

	@RequestMapping(value = "/medicalCheck", method = RequestMethod.POST)
	@ResponseBody
	public List check(String PATID,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>get</FUNCTIONSUB>")
				.append("<PATID>"+PATID+"</PATID>")
				.setProcedure("sp_SFS_CHECKPAT").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/outpatientQuery", method = RequestMethod.POST)
	@ResponseBody
	public List query(String PATID,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>get</FUNCTIONSUB>")
				.append("<PATID>"+PATID+"</PATID>")
				.setProcedure("sp_T_SFS_ALLPAT").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/outpatientAdd", method = RequestMethod.POST)
	@ResponseBody
	public List add(String PATNAME,String PATSEX,String PATID,String PATAGE,String BOTHYEAR,
			String BOTNINA,String ISBOTH,String ISYEAR,String AMAN,String ANSEX,String AMMOTH,
			String ADDRESS,String TEL,String QQ,String EMAIL,String EMSG,String REMARK,
			String LASTCHECKDATE,String CREATOR,String CREATEDATE,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>get</FUNCTIONSUB>")
				.append("<PATNAME>"+PATNAME+"</PATNAME>")
				.append("<PATSEX>"+PATSEX+"</PATSEX>")
				.append("<PATID>"+PATID+"</PATID>")
				.append("<PATAGE>"+PATAGE+"</PATAGE>")
				.append("<BOTHYEAR>"+BOTHYEAR+"</BOTHYEAR>")
				.append("<BOTNINA>"+BOTNINA+"</BOTNINA>")
				.append("<ISBOTH>"+ISBOTH+"</ISBOTH>")
				.append("<ISYEAR>"+ISYEAR+"</ISYEAR>")
				.append("<AMAN>"+AMAN+"</AMAN>")
				.append("<ANSEX>"+ANSEX+"</ANSEX>")
				.append("<AMMOTH>"+AMMOTH+"</AMMOTH>")
				.append("<ADDRESS>"+ADDRESS+"</ADDRESS>")
				.append("<TEL>"+TEL+"</TEL>")
				.append("<QQ>"+QQ+"</QQ>")
				.append("<EMAIL>"+EMAIL+"</EMAIL>")
				.append("<EMSG>"+EMSG+"</EMSG>")
				.append("<REMARK>"+REMARK+"</REMARK>")
				.append("<LASTCHECKDATE>"+LASTCHECKDATE+"</LASTCHECKDATE>")
				.append("<CREATOR>"+CREATOR+"</CREATOR>")
				.append("<CREATEDATE>"+CREATEDATE+"</CREATEDATE>")
				.setProcedure("sp_T_SFS_ALLPAT").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/outpatientUpdate", method = RequestMethod.POST)
	@ResponseBody
	public List update(String ORDROWID,String PATNAME,String PATSEX,String PATID,String PATAGE,String BOTHYEAR,
			String BOTNINA,String ISBOTH,String ISYEAR,String AMAN,String ANSEX,String AMMOTH,
			String ADDRESS,String TEL,String QQ,String EMAIL,String EMSG,String REMARK,
			String LASTCHECKDATE,String CREATOR,String CREATEDATE,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>update</FUNCTIONSUB>")
				.append("<ORDROWID>"+ORDROWID+"</ORDROWID>")
				.append("<PATNAME>"+PATNAME+"</PATNAME>")
				.append("<PATSEX>"+PATSEX+"</PATSEX>")
				.append("<PATID>"+PATID+"</PATID>")
				.append("<PATAGE>"+PATAGE+"</PATAGE>")
				.append("<BOTHYEAR>"+BOTHYEAR+"</BOTHYEAR>")
				.append("<BOTNINA>"+BOTNINA+"</BOTNINA>")
				.append("<ISBOTH>"+ISBOTH+"</ISBOTH>")
				.append("<ISYEAR>"+ISYEAR+"</ISYEAR>")
				.append("<AMAN>"+AMAN+"</AMAN>")
				.append("<ANSEX>"+ANSEX+"</ANSEX>")
				.append("<AMMOTH>"+AMMOTH+"</AMMOTH>")
				.append("<ADDRESS>"+ADDRESS+"</ADDRESS>")
				.append("<TEL>"+TEL+"</TEL>")
				.append("<QQ>"+QQ+"</QQ>")
				.append("<EMAIL>"+EMAIL+"</EMAIL>")
				.append("<EMSG>"+EMSG+"</EMSG>")
				.append("<REMARK>"+REMARK+"</REMARK>")
				.append("<LASTCHECKDATE>"+LASTCHECKDATE+"</LASTCHECKDATE>")
				.append("<CREATOR>"+CREATOR+"</CREATOR>")
				.append("<CREATEDATE>"+CREATEDATE+"</CREATEDATE>")
				.setProcedure("sp_T_SFS_ALLPAT").excust(procedureInterface);
	}
	
	@RequestMapping(value = "/outpatientDel", method = RequestMethod.POST)
	@ResponseBody
	public List del(String ordrowid,FollowModel followModel) {
		return followModel.append("<FUNCTIONSUB>del</FUNCTIONSUB>")
				.append("<ORDROWID>"+ordrowid+"</ORDROWID>")
				.setProcedure("sp_T_SFS_ALLPAT").excust(procedureInterface);
	}

}
