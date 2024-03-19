package com.ezen.seo0308.book;

public class Book_DTO {
	int bnum;
	String bname;
	String bwriter;
	String bcontent;
	int bprice;
	String bdate;
	String bimage;
	int bcount;
	
	public Book_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book_DTO(int bnum, String bname, String bwriter, String bcontent, int bprice, String bdate, String bimage,
			int bcount) {
		super();
		this.bnum = bnum;
		this.bname = bname;
		this.bwriter = bwriter;
		this.bcontent = bcontent;
		this.bprice = bprice;
		this.bdate = bdate;
		this.bimage = bimage;
		this.bcount = bcount;
	}

	public int getBnum() {
		return bnum;
	}

	public void setBnum(int bnum) {
		this.bnum = bnum;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public int getBprice() {
		return bprice;
	}

	public void setBprice(int bprice) {
		this.bprice = bprice;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getBimage() {
		return bimage;
	}

	public void setBimage(String bimage) {
		this.bimage = bimage;
	}

	public int getBcount() {
		return bcount;
	}

	public void setBcount(int bcount) {
		this.bcount = bcount;
	}

	
	
}
