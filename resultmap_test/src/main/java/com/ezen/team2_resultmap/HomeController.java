package com.ezen.team2_resultmap;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping(value = "/")
	public String home(Model mo) {
		Service sv = sqlSession.getMapper(Service.class);
		ArrayList<Info_DTO> list = sv.total();
		
		mo.addAttribute("list", list);
		
		return "home";
	}
}
