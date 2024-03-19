package com.ezen.dd0319;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Autowired
	SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value ="/")
	public String m3(Model mo) {
		Infoservice ss = sqlSession.getMapper(Infoservice.class);
		ArrayList<MyinfoDTO>list=ss.print();
		mo.addAttribute("list",list);
		return "out";
	}
	
}
