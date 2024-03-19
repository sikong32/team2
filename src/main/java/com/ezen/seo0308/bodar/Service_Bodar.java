package com.ezen.seo0308.bodar;

import java.util.ArrayList;

public interface Service_Bodar {

	void input(String weiter, String title, String content);

	ArrayList<Bodar_DTO> out();

	void delete(int bnum);

	ArrayList<Bodar_DTO> detail(int bnum);

	void readcntup(int bnum);

	ArrayList<Bodar_DTO> replyview(int bnum);

	void replysave(String weiter, String title, String content, int groups, int step, int indent);

	void stepup(int groups, int step);

	ArrayList<Bodar_DTO> replysave1(int bnum, String comment);
	
	// 페이지 처리 4 단계
	public int total();
	
	public ArrayList<Bodar_DTO> page(PageDTO dto);
}
