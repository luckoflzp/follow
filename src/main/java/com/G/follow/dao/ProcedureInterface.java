package com.G.follow.dao;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;
@Controller
public interface ProcedureInterface {
	List<Map<String,Object>> operaProcedure(Map map);
}
