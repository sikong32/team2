package com.ezen.seo0308.yuhyo;

import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Yuhyo_Controller {
	@Autowired
	SqlSession sqlsession;
	
	@RequestMapping(value = "/yuhyo_input")
	public String yuhyo() {
		return "yuhyo_input";
	}
	@RequestMapping(value = "/yuhyo_out")
	public String yuhyo2() {
		return "yuhyo_out";
	}
	@RequestMapping(value = "/yuhyo_save")
	public String yuhyo1(@ModelAttribute Yuhyo_DTO yuhyo_DTO,BindingResult br,HttpServletResponse response,PrintWriter pw) {
		//ModelAttribute => 안정성을 높이기 위해
		String viewPage = "yuhyo_out";
 		Yuhyo_DTO_Validator vdto= new Yuhyo_DTO_Validator();
		vdto.validate(yuhyo_DTO, br);
		String er = null;
		if(br.hasErrors()) {
			System.out.println(br.getFieldErrors());
			for(FieldError error : br.getFieldErrors()) {
//	            System.out.println(error.getCode());
	            er = error.getCode();
	            error.getField();
			}
//			if (br.getFieldErrors().get(0).getField().equals("name")) {
//				br.getFieldErrors().get(0).getCode();
//			}
//			System.out.println(er);
			response.setContentType("text/html;charset=utf-8");
			pw.print("<script> alert('"+ er + "');</script>");
			viewPage="redirect:yuhyo_input";
			pw.close();
//			System.out.println(br.getFieldError("name").getCode());
		}
		return viewPage;
	}
}
