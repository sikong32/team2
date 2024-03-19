package com.ezen.seo0308.id;

import java.util.ArrayList;

public interface Service_ID {

	void save(String id, String pw, String name, String tel, String sb, String address, String hobby, String insa);

	ArrayList<Id_DTO> out();

	ArrayList<Id_DTO> idchek(String id);

	ArrayList<Id_DTO> idsearch(String id);

	ArrayList<Id_DTO> ideletesearch(String id);

	void idelete(String id);

	ArrayList<Id_DTO> ideletesearch2(String id, String pw);

	void modify(String id, String pw, String name, String tel, String sb, String address, String hobby, String insa);

	void login(String id, String pw);
}
