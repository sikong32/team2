package com.ezen.seo0308.id;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ID_Controller {
	@Autowired
	SqlSession sqlsession;

	private static final Logger logger = LoggerFactory.getLogger(ID_Controller.class);

	@RequestMapping(value = "/id_input")
	public String home() {
		return "id_input";
	}

	@RequestMapping(value = "/id_save")
	public String home2(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String sb = request.getParameter("sb");
		String address = request.getParameter("address");
		String hobby = request.getParameter("hobby");
		String insa = request.getParameter("insa");
		Service_ID ss = sqlsession.getMapper(Service_ID.class);
		ss.save(id, pw, name, tel, sb, address, hobby, insa);
		return "main";
	}

	@RequestMapping(value = "/id_out")
	public String home3(Model model,HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession hs = request.getSession();
		if((boolean)hs.getAttribute("loginOK")) {
			Service_ID ss = sqlsession.getMapper(Service_ID.class);
			ArrayList<Id_DTO> list = ss.out();
			model.addAttribute("list", list);
			return "id_out";			
		}else {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter pw = response.getWriter();
			pw.print("<script>alert('로그인 한 회원만 볼수 있습니다.'); window.location.href='main';</script>");
			pw.close();
			return null;
		}
	}

	@ResponseBody
	@RequestMapping(value = "/idchek")
	public String home4(String id) {
		Service_ID ss = sqlsession.getMapper(Service_ID.class);
		ArrayList<Id_DTO> list = ss.idchek(id);
		if (list.size() == 0) {
			return "ok";
		} else {
			return "nok";
		}
	}

	@RequestMapping(value = "/id_search")
	public String home5(HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession hs = request.getSession();
		if((boolean)hs.getAttribute("loginOK")) {
			return "id_search";
		}else {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter pw = response.getWriter();
			pw.print("<script>alert('로그인 한 회원만 볼수 있습니다.'); window.location.href='main';</script>");
			pw.close();
			return null;
		}
	}

	@RequestMapping(value = "/id_search2")
	public String home6(HttpServletRequest request, Model model) {
		Service_ID ss = sqlsession.getMapper(Service_ID.class);
		String id = request.getParameter("id_search");
		ArrayList<Id_DTO> list = ss.idsearch(id);
		model.addAttribute("list", list);
		return "id_out";
	}

	@RequestMapping(value = "/id_deletesearch")
	public String home7(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Service_ID ss = sqlsession.getMapper(Service_ID.class);
		ArrayList<Id_DTO> list = ss.ideletesearch(id);
		model.addAttribute("list", list);
		return "id_delete";
	}

	@RequestMapping(value = "/id_delete")
	public String home8(HttpServletRequest request, Model model) {
		String bigo;
		Service_ID ss = sqlsession.getMapper(Service_ID.class);
		String id = request.getParameter("deleteid");
		System.out.println(id);
		String pw = request.getParameter("deletepw");
		ArrayList<Id_DTO> list = ss.ideletesearch2(id, pw);
		if (list.size() == 0) {
			bigo = "id_out";
		} else {
			ss.idelete(id);
			bigo = "main";
		}
		return bigo;
	}

	@RequestMapping(value = "/id_modifysearch")
	public String home9(HttpServletRequest request, Model model) {
		Service_ID ss = sqlsession.getMapper(Service_ID.class);
		String id = request.getParameter("id");
		System.out.println(id);
		ArrayList<Id_DTO> list = ss.ideletesearch(id);
		model.addAttribute("list", list);
		return "id_mdify";
	}

	@RequestMapping(value = "/id_mdifyfix")
	public String home10(HttpServletRequest request, Model model) {
		Service_ID ss = sqlsession.getMapper(Service_ID.class);
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String sb = request.getParameter("sb");
		String address = request.getParameter("address");
		String hobby = request.getParameter("hobby");
		String insa = request.getParameter("insa");
		ss.modify(id, pw, name, tel, sb, address, hobby, insa);
		return "id_out";
	}

	@RequestMapping(value = "/id_login")
	public String home11() {
		return "id_login";
	}

	@RequestMapping(value = "/id_loginfix")
	public String home12(HttpServletRequest request, Model model) {
		Service_ID ss = sqlsession.getMapper(Service_ID.class);
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		ArrayList<Id_DTO> list = ss.ideletesearch2(id, pw);
		if (list.size() != 0) {
			HttpSession hs = request.getSession();
			hs.setAttribute("loginOK", true);
			hs.setAttribute("id", list.get(0).getName());
			hs.setMaxInactiveInterval(100);
			System.out.println("로그인 성공");
			return "main";
		} else {
			System.out.println("로그인 실패");
			return "id_login";
		}
	}

	@RequestMapping(value = "/id_logout")
	public String home13(HttpServletRequest request, Model model) {
		HttpSession hs = request.getSession();
		hs.setAttribute("loginOK",false);
		hs.removeAttribute("id");
		return "main";
	}

}
