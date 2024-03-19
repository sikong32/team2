package com.ezen.seo0308.book;

public class Book_Page_DTO {
	int nowPage; // 현재 페이지
	int startPage; // 시작 페이지
	int endPage; // 끝 페이지
	int total; // 총 게시글의 수
	int cntPerPage; // 페이지당 보여줄 게시글의 수
	int lastPage; // 전체 페이지
	int start; // 퀘리에 사용할 시작 페이지
	int end; // 퀘리에 사용할 끝 페이지
	int cntPage = 3; // 한 화면에 표시하고자 하는 페이지의 수

	public Book_Page_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book_Page_DTO(int total, int nowPage,int cntPerPage) {
		setNowPage(nowPage);
		setCntPerPage(cntPerPage);
		setTotal(total);
		callLastPage(getTotal(), getCntPerPage());
		callStartEndPage(getNowPage(), cntPage);
		callStartEnd(getNowPage(), getCntPerPage());
		System.out.println("dto안에 있는 스타트 페이지"+getStartPage());
		System.out.println("dto안에 있는 앤드 페이지"+getEndPage());
	}

	// 전체 페이지 수
	public void callLastPage(int total, int cntPerPage) {
		setLastPage((int) Math.ceil((double) total / cntPerPage));
		System.out.println("전체페이지" + getLastPage());
	}

//	 시작페이지와 끝 페이지
	private void callStartEndPage(int nowPage, int cntPage) {
		setEndPage(((int) Math.ceil((double) nowPage / cntPage)) * cntPage);
		if (getLastPage() < getEndPage()) {
			setEndPage(getLastPage());
		}
		System.out.println("끝 페이지 :" + getEndPage());
		setStartPage(getEndPage() - cntPage + 1);
		if (getStartPage() < 1) {
			setStartPage(1);
		}
	}
//	// 시작 페이지가 항상 중간
//	public void callStartEndPage(int nowPage, int cntPage) {
//	      setStartPage(nowPage-(cntPage-1)/2);
//	      setEndPage(nowPage+(cntPage-1)/2);
//	      if (getStartPage() < 1) {
//	         setStartPage(1);
//	         setEndPage(getEndPage() + ((nowPage-(cntPage-1)/2)*-1)+1);
//	      }
//	      if (getEndPage() > getLastPage()) {
//	         setEndPage(getLastPage());
//	         setStartPage(getStartPage() - (nowPage+(cntPage-1)/2-getLastPage()));
//	      }
//	   }
	// DB쿼리에 정의할 start, end
	private void callStartEnd(int nowPage, int cntPerPage) {
		setEnd(nowPage * cntPerPage);
		setStart(getEnd() - cntPerPage + 1);
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCntPerPage() {
		return cntPerPage;
	}

	public void setCntPerPage(int cntPerPage) {
		this.cntPerPage = cntPerPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getCntPage() {
		return cntPage;
	}

	public void setCntPage(int cntPage) {
		this.cntPage = cntPage;
	}

}
