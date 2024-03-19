package com.ezen.seo0308.car;

public class Car_page_DTO {
	int 현재페이지;
	int 시작페이지;
	int 끝페지;
	int 총글수;
	int 페이지보여줄글수;
	int 전체페이지;
	int start;
	int end;
	int 표시할페이지수 = 3;

	public Car_page_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car_page_DTO(int 총글수, int 현재페이지, int 페이지보여줄글수) {
		set현재페이지(현재페이지);
		set페이지보여줄글수(페이지보여줄글수);
		set총글수(총글수);
		call1(get총글수(), get페이지보여줄글수());
		call2(get현재페이지(), 표시할페이지수);
		call3(get현재페이지(), get페이지보여줄글수());
	}

	// DB퀘리에 정의할 start, end
	private void call3(int 현재페이지, int 페이지보여줄글수) {
		setEnd(현재페이지 * 페이지보여줄글수);
		setStart(getEnd() - 페이지보여줄글수 + 1);
		System.out.println("dto안에 현재 페이지:" + 현재페이지);
		System.out.println("dto안에 페이지보여줄 글수:" + 페이지보여줄글수);
	}

	// 시작 페이지와 끝 페이지
	private void call2(int 현재페이지, int 표시할페이지수) {
		set끝페지((int) (Math.ceil((double) 현재페이지 / (double) 표시할페이지수)) * 표시할페이지수);
		if (get전체페이지() < get끝페지()) {
			set끝페지(get전체페이지());
		}
		set시작페이지(get끝페지() - 표시할페이지수 + 1);
		if (get시작페이지() < 1) {
			set시작페이지(1);
		}
	}

	// 전체 페이지수
	private void call1(int 총글수, int 페이지보여줄글수) {
		set전체페이지((int) Math.ceil((double) 총글수 / (double) 페이지보여줄글수));
	}

	public int get현재페이지() {
		return 현재페이지;
	}

	public void set현재페이지(int 현재페이지) {
		this.현재페이지 = 현재페이지;
	}

	public int get시작페이지() {
		return 시작페이지;
	}

	public void set시작페이지(int 시작페이지) {
		this.시작페이지 = 시작페이지;
	}

	public int get끝페지() {
		return 끝페지;
	}

	public void set끝페지(int 끝페지) {
		this.끝페지 = 끝페지;
	}

	public int get총글수() {
		return 총글수;
	}

	public void set총글수(int 총글수) {
		this.총글수 = 총글수;
	}

	public int get페이지보여줄글수() {
		return 페이지보여줄글수;
	}

	public void set페이지보여줄글수(int 페이지보여줄글수) {
		this.페이지보여줄글수 = 페이지보여줄글수;
	}

	public int get전체페이지() {
		return 전체페이지;
	}

	public void set전체페이지(int 전체페이지) {
		this.전체페이지 = 전체페이지;
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

	public int get표시할페이지수() {
		return 표시할페이지수;
	}

	public void set표시할페이지수(int 표시할페이지수) {
		this.표시할페이지수 = 표시할페이지수;
	}

}
