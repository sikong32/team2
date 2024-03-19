package com.ezen.team2_resultmap;

public class Info_DTO {
	int serial;
	String name;
	String tel;
	Score_DTO score_dto;
	Insa_DTO insa_dto;
	int tot;
	int total_pay;
	String rank;
	public Info_DTO() {
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
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
	public Score_DTO getScore_dto() {
		return score_dto;
	}
	public void setScore_dto(Score_DTO score_dto) {
		this.score_dto = score_dto;
	}
	public Insa_DTO getInsa_dto() {
		return insa_dto;
	}
	public void setInsa_dto(Insa_DTO insa_dto) {
		this.insa_dto = insa_dto;
	}
}
