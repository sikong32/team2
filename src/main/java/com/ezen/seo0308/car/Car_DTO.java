package com.ezen.seo0308.car;

public class Car_DTO {
	int sawonnum;
	String jijum;
	String carname;
	int carsu;
	int carprice;
	int tot;
	public Car_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car_DTO(int sawonnum, String jijum, String carname, int carsu, int carprice) {
		super();
		this.sawonnum = sawonnum;
		this.jijum = jijum;
		this.carname = carname;
		this.carsu = carsu;
		this.carprice = carprice;
		setTot(carsu*carprice);
	}
	public int getSawonnum() {
		return sawonnum;
	}
	public void setSawonnum(int sawonnum) {
		this.sawonnum = sawonnum;
	}
	public String getJijum() {
		return jijum;
	}
	public void setJijum(String jijum) {
		this.jijum = jijum;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public int getCarsu() {
		return carsu;
	}
	public void setCarsu(int carsu) {
		this.carsu = carsu;
	}
	public int getCarprice() {
		return carprice;
	}
	public void setCarprice(int carprice) {
		this.carprice = carprice;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	
}
