package com.ezen.seo0308.car;

import java.util.ArrayList;

public interface Car_service {

	void input(String jijum, String carname, int carsu, int carprice);

	ArrayList<Car_DTO> out();

	int zhongliang();

	ArrayList<Car_DTO> carpage(Car_page_DTO dto);

	ArrayList<Car_DTO> out3();

	ArrayList<Car_DTO> out4();

	ArrayList<Car_DTO> out5();

}
