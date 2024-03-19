package com.ezen.seo0308.id;

public class Id_DTO {
	String id;
	String pw;
	String name;
	String tel;
	String sb;
	String address;
	String hobby;
	String insa;
	
	public Id_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Id_DTO(String id, String pw, String name, String tel, String sb, String address, String hobby, String insa) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.sb = sb;
		this.address = address;
		this.hobby = hobby;
		this.insa = insa;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSb() {
		return sb;
	}
	public void setSb(String sb) {
		this.sb = sb;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getInsa() {
		return insa;
	}
	public void setInsa(String insa) {
		this.insa = insa;
	}
	
}
