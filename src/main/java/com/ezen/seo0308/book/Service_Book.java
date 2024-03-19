package com.ezen.seo0308.book;

import java.util.ArrayList;

public interface Service_Book {

	void insert(String bname, String bweiter, String bdate, String bcontent, String fname, int bprice);

	ArrayList<Book_DTO> print();

	ArrayList<Book_DTO> deteil(int bnum);

	void count(int bnum);

	void delete(int bnum);

	void modify(int bnum, String bname, String bweiter, String bdate, String bcontent, String bookname, int bprice);

	int total();

	ArrayList<Book_DTO> bookpage(Book_Page_DTO dto);

	ArrayList<Book_DTO> weiterserach(String searchname);

	ArrayList<Book_DTO> bookserach(String searchname);
	
}
