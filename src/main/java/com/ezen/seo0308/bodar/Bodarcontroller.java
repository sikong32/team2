package com.ezen.seo0308.bodar;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.seo0308.HomeController;
@Controller
public class Bodarcontroller {
	@Autowired
	SqlSession sqlsession;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/boardinput")
	public String board() {
		return "boardinput";
	}

	@RequestMapping(value = "/boardsave",method = RequestMethod.POST)
	public String board3(HttpServletRequest request) {
		String weiter = request.getParameter("weiter");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Service_Bodar ss = sqlsession.getMapper(Service_Bodar.class);
		ss.input(weiter,title,content);
		return "main";
	}
//	@RequestMapping(value = "/boardout")//일반 아웃
//	public String board4(Model model) {
//		Service_Bodar ss = sqlsession.getMapper(Service_Bodar.class);
//		ArrayList<Bodar_DTO> list = ss.out();
//		model.addAttribute("list",list);
//		return "boardout";
//	}
	
	  @RequestMapping(value="/page")// 페이지 처리 3 단계
      public String ko16(HttpServletRequest request, PageDTO dto,Model mo) {
         String nowPage=request.getParameter("nowPage");
         String cntPerPage=request.getParameter("cntPerPage");
         Service_Bodar ss = sqlsession.getMapper(Service_Bodar.class);
         //전체레코드수구하기
         int total=ss.total();
         System.out.println(total+"총 레코드의 갯수");
         if(nowPage==null && cntPerPage == null) {
            nowPage="1";
            cntPerPage="5";
         }
         else if(nowPage==null) {
            nowPage="1";
         }
         else if(cntPerPage==null) {
            cntPerPage="5";
         }
         dto=new PageDTO(total,Integer.parseInt(nowPage),Integer.parseInt(cntPerPage));
         mo.addAttribute("paging",dto);
         mo.addAttribute("list",ss.page(dto));
         return "boardout";
      }
	  
	@RequestMapping(value = "/boarddelete")
	public String board5(HttpServletRequest request) {
		int bnum = Integer.parseInt(request.getParameter("bnum"));
		Service_Bodar ss = sqlsession.getMapper(Service_Bodar.class);
		ss.delete(bnum);
		return "redirect:boardout";
	}

	@RequestMapping(value = "/boarddetail")
	public String board6(HttpServletRequest request,Model model) {
		int bnum = Integer.parseInt(request.getParameter("bnum"));
		Service_Bodar ss = sqlsession.getMapper(Service_Bodar.class);
		readup(bnum);//조회수증가
		ArrayList<Bodar_DTO> list = ss.detail(bnum);
		model.addAttribute("list",list);
		return "boarddetail";
	}
	private void readup(int bnum) {
		Service_Bodar ss = sqlsession.getMapper(Service_Bodar.class);
		ss.readcntup(bnum);
	}
	@RequestMapping(value = "/reply")//선생님 댓글 작성 
	public String board7(HttpServletRequest request,Model model) {
		int bnum = Integer.parseInt(request.getParameter("bnum"));
		System.out.println(bnum);
		Service_Bodar ss = sqlsession.getMapper(Service_Bodar.class);
		ArrayList<Bodar_DTO> list = ss.replyview(bnum);
		model.addAttribute("list",list);
		return "replyview";
	}
	@RequestMapping(value = "/replysave")
	public String board8(HttpServletRequest request,Model model) {
		int bnum = Integer.parseInt(request.getParameter("bnum"));
		int groups = Integer.parseInt(request.getParameter("groups"));
		int step = Integer.parseInt(request.getParameter("step"));
		int indent = Integer.parseInt(request.getParameter("indent"));
		String weiter = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Service_Bodar ss = sqlsession.getMapper(Service_Bodar.class);
		stepup(groups,step);
		step++;
		indent++;
		ss.replysave(weiter,title,content,groups,step,indent);
		return "redirect:boardout";
	}

	private void stepup(int groups, int step) {
		Service_Bodar ss = sqlsession.getMapper(Service_Bodar.class);
		ss.stepup(groups,step);
	}
//	@RequestMapping(value = "/reply")//내가 만든 댓글
//	public String board9(HttpServletRequest request,Model model) {
//		int bnum = Integer.parseInt(request.getParameter("bnum"));
//		String comment = request.getParameter("comment");
//		Service_Bodar ss = sqlsession.getMapper(Service_Bodar.class);
//		ArrayList<Bodar_DTO> list = ss.detail(bnum);
//		ss.replysave1(bnum,comment);
//		model.addAttribute("list",list);
//		return "replyview";
//	}
}
