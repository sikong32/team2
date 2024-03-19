package com.ezen.seo0308.book;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class Book_Controller {
	@Autowired
	SqlSession sqlsession;

	String image_path = "C:\\이젠디지탈12\\spring\\Day09_spring_framework_20240308\\src\\main\\webapp\\image";

	@RequestMapping(value = "/bookinput")
	public String book() {
		return "bookinput";
	}

	@RequestMapping(value = "/booksave")
	public String book1(MultipartHttpServletRequest mul) throws IllegalStateException, IOException {
		String bweiter = mul.getParameter("bweiter");
		String bname = mul.getParameter("bname");
		String bcontent = mul.getParameter("bcontent");
		int bprice = Integer.parseInt(mul.getParameter("bprice"));
		String bdate = mul.getParameter("bdate");
		MultipartFile mf = mul.getFile("bimag");
		String fname = mf.getOriginalFilename();
		// 랜덤 파일 네임
		UUID uuid = UUID.randomUUID();
		String bookname = uuid.toString() + "_" + fname;
		// 랜덤이름 파일 저장
		mf.transferTo(new File(image_path + "\\" + bookname));
		Service_Book ss = sqlsession.getMapper(Service_Book.class);
		ss.insert(bname, bweiter, bdate, bcontent, bookname, bprice);
		System.out.println("여기는 왔나?");

		return "main";
	}

//	@RequestMapping(value = "/bookout")
//	public String book2(Model model) throws IllegalStateException, IOException {
//		Service_Book ss = sqlsession.getMapper(Service_Book.class);
//		ArrayList<Book_DTO> list = ss.print();
//		model.addAttribute("list",list);
//		return "bookout";
//	}
	@RequestMapping(value = "/bookdeteil")
	public String book3(HttpServletRequest request, Model model) {
		int bnum = Integer.parseInt(request.getParameter("bnum"));
		Service_Book ss = sqlsession.getMapper(Service_Book.class);
		ss.count(bnum);
		ArrayList<Book_DTO> list = ss.deteil(bnum);
		model.addAttribute("list", list);
		return "bookdeteil";
	}

	@RequestMapping(value = "/bookdelete")
	public String book4(HttpServletRequest request) {
		int bnum = Integer.parseInt(request.getParameter("bnum"));
		String image = request.getParameter("image");
		System.out.println(image);
		Service_Book ss = sqlsession.getMapper(Service_Book.class);
		ss.delete(bnum);
		File delimg = new File(image_path + "\\" + image);
		delimg.delete();
		return "redirect:bookout";
	}

	@RequestMapping(value = "/bookmodify")
	public String book5(HttpServletRequest request, Model model) {
		int bnum = Integer.parseInt(request.getParameter("bnum"));
		Service_Book ss = sqlsession.getMapper(Service_Book.class);
		ArrayList<Book_DTO> list = ss.deteil(bnum);
		model.addAttribute("list", list);
		return "bookmodify";
	}

	@RequestMapping(value = "/bookmodifysave",method = RequestMethod.POST)
	public String book6(MultipartHttpServletRequest mul) throws IllegalStateException, IOException {
		int bnum = Integer.parseInt(mul.getParameter("bnum"));
		String bweiter = mul.getParameter("bweiter");
		String bname = mul.getParameter("bname");
		String bcontent = mul.getParameter("bcontent");
		int bprice = Integer.parseInt(mul.getParameter("bprice"));
		String bdate = mul.getParameter("bdate");
		System.out.println(bnum);
		System.out.println(bweiter);
		System.out.println(bname);
		System.out.println(bcontent);
		System.out.println(bprice);
		System.out.println(bdate);
		MultipartFile mf = mul.getFile("bimag");
		String fname = mf.getOriginalFilename();
		// 랜덤 파일 네임
		UUID uuid = UUID.randomUUID();
		String bookname = uuid.toString() + "_" + fname;
		// 랜덤이름 파일 저장
		mf.transferTo(new File(image_path + "\\" + bookname));
		Service_Book ss = sqlsession.getMapper(Service_Book.class);
		ss.modify(bnum, bname, bweiter, bdate, bcontent, bookname, bprice);
		System.out.println("여기는 왔나?");
		return "bookout";
	}

	@RequestMapping(value = "/bookpage")
	public String book7(HttpServletRequest request, Model model) {
		String nowPage = request.getParameter("nowPage");
		String cntPerPage = request.getParameter("cntPerPage");
		Service_Book ss = sqlsession.getMapper(Service_Book.class);
		// 전체게시글 수 구하기
		int total = ss.total();
		System.out.println("도서관리의 총 게시글 수: " + total);
		if (nowPage == null && cntPerPage == null) {
			nowPage = "1";
			cntPerPage = "1";
		} else if (nowPage == null) {
			nowPage = "1";
		} else if (cntPerPage == null) {
			cntPerPage = "1";
		}
		Book_Page_DTO dto = new Book_Page_DTO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
		model.addAttribute("paging",dto);
		model.addAttribute("list",ss.bookpage(dto));
		return "bookout";
	}
	@RequestMapping(value = "/booksearch")
	public String book8() {
		return "booksearch";
	}
	@RequestMapping(value = "/booksearchout")
	public String book9(HttpServletRequest request, Model model) {
		Service_Book ss = sqlsession.getMapper(Service_Book.class);
		String select = request.getParameter("bname");
		String searchname = request.getParameter("searchname");
		System.out.println(select);
		System.out.println(searchname);
		ArrayList<Book_DTO> list;
		if(select.equals("bweiter")) {
			System.out.println("작가로 검색");
			list = ss.weiterserach(searchname);
		}else {
			System.out.println("책 으로 검색");
			list = ss.bookserach(searchname);
		}
		model.addAttribute("list", list);
		System.out.println("검색 정보 넘김");
		return "bookdeteil";
	}
}
