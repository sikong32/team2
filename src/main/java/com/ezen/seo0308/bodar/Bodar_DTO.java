package com.ezen.seo0308.bodar;

public class Bodar_DTO {
	int bnum;
	String writer;
	String title;
	String content;
	String writerday;
	int readcnt;
	int groups;
	int step;
	int indent;
	public Bodar_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bodar_DTO(int bnum, String writer, String title, String content, String writerday, int readcnt, int groups,
			int step, int indent) {
		super();
		this.bnum = bnum;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.writerday = writerday;
		this.readcnt = readcnt;
		this.groups = groups;
		this.step = step;
		this.indent = indent;
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriterday() {
		return writerday;
	}
	public void setWriterday(String writerday) {
		this.writerday = writerday;
	}
	public int getReadcnt() {
		return readcnt;
	}
	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}
	public int getGroups() {
		return groups;
	}
	public void setGroups(int groups) {
		this.groups = groups;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public int getIndent() {
		return indent;
	}
	public void setIndent(int indent) {
		this.indent = indent;
	}
	
}
