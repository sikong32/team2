package com.ezen.seo0308.car;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Car_Controller {
	@Autowired
	SqlSession sqlsession;
	
	@RequestMapping(value = "car_input")
	public String car() {
		return "car_input";
	}
	@RequestMapping(value = "car_save")
	public String car1(HttpServletRequest request) {
		String jijum = request.getParameter("jijum");
		String carname = request.getParameter("carname");
		int carsu = Integer.parseInt(request.getParameter("carsu"));
		int carprice = Integer.parseInt(request.getParameter("carprice"));
		Car_service ss = sqlsession.getMapper(Car_service.class);
		ss.input(jijum,carname,carsu,carprice);
		return "main";
	}
//	@RequestMapping(value = "car_out")
//	public String car2(Model mo) {
//		Car_service ss = sqlsession.getMapper(Car_service.class);
//	ArrayList<Car_DTO> list = ss.out();
//	mo.addAttribute("list",list);
//		return "car_out";
//	}
	@RequestMapping(value = "car_out")
	public String car2(Model mo,HttpServletRequest request) {
		String 현재페이지 = request.getParameter("현재페이지");
		String 페이지보여줄글수 = request.getParameter("페이지보여줄글수");
		System.out.println("현재페이지"+현재페이지);
		System.out.println("페이지보여줄글수"+페이지보여줄글수);
		Car_service ss = sqlsession.getMapper(Car_service.class);
		// 전체게시글 수 구하기
		int 전체게시글 = ss.zhongliang();
		System.out.println(전체게시글);
		if(현재페이지 == null && 페이지보여줄글수==null) {
			현재페이지 = "1";
			페이지보여줄글수 = "2";
		}else if(현재페이지==null) {
			현재페이지 = "1";
		}else if(페이지보여줄글수 == null) {
			페이지보여줄글수="2";
		}
		Car_page_DTO dto = new Car_page_DTO(전체게시글, Integer.parseInt(현재페이지),Integer.parseInt(페이지보여줄글수));
		ArrayList<Car_DTO> list = ss.carpage(dto);
		System.out.println("시작페이지 "+dto.get시작페이지());
		System.out.println("끝페이지 "+dto.get끝페지());
		System.out.println("현재페이지 "+dto.get현재페이지());
		mo.addAttribute("dto",dto);
		mo.addAttribute("list",list);
		return "car_out";
	}
	@RequestMapping(value = "car_out3")
	public String car3(Model mo) {
		Car_service ss = sqlsession.getMapper(Car_service.class);
		ArrayList<Car_DTO> list = ss.out3();
		mo.addAttribute("list",list);
		return "car_out3";
	}
	@RequestMapping(value = "car_out4")
	public String car4(Model mo) {
		Car_service ss = sqlsession.getMapper(Car_service.class);
		ArrayList<Car_DTO> list = ss.out4();
		mo.addAttribute("list",list);
		return "car_out4";
	}
	@RequestMapping(value = "car_out5")
	public String car5(Model mo) {
		Car_service ss = sqlsession.getMapper(Car_service.class);
		ArrayList<Car_DTO> list = ss.out5();
		mo.addAttribute("list",list);
		return "car_out5";
	}
}
