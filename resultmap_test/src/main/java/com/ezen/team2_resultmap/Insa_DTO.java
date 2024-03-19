package com.ezen.team2_resultmap;

public class Insa_DTO {
	int serial;
	String rank;
	int family_pay;
	int default_pay;
	int total_pay;
	public Insa_DTO() {
	}
	public Insa_DTO(int serial, String rank, int family_pay, int default_pay, int total_pay) {
		this.serial = serial;
		this.rank = rank;
		this.family_pay = family_pay;
		this.default_pay = default_pay;
		this.total_pay = total_pay;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getFamily_pay() {
		return family_pay;
	}
	public void setFamily_pay(int family_pay) {
		this.family_pay = family_pay;
	}
	public int getDefault_pay() {
		return default_pay;
	}
	public void setDefault_pay(int default_pay) {
		this.default_pay = default_pay;
	}
	public int getTotal_pay() {
		return total_pay;
	}
	public void setTotal_pay(int total_pay) {
		this.total_pay = total_pay;
	}
}
