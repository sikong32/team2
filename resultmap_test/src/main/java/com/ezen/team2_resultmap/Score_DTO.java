package com.ezen.team2_resultmap;

public class Score_DTO {
	int serial;
	int kor;
	int eng;
	int mat;
	int tot;
	public Score_DTO() {
	}
	public Score_DTO(int serial, int kor, int eng, int mat, int tot) {
		this.serial = serial;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
}
