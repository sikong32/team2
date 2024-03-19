package com.ezen.dd0319;

public class MyinfoDTO {
	
	int tot, price;
	
	String id, name, phone;
	ScoreDTO scoreDTO;
	InsaDTO insaDTO;

	public MyinfoDTO() {	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public InsaDTO getInsaDTO() {
		return insaDTO;
	}

	public void setInsaDTO(InsaDTO insaDTO) {
		this.insaDTO = insaDTO;
	}

	public ScoreDTO getScoreDTO() {
		return scoreDTO;
	}

	public void setScoreDTO(ScoreDTO scoreDTO) {
		this.scoreDTO = scoreDTO;
	}

}
