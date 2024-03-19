package com.ezen.seo0308.yuhyo;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class Yuhyo_DTO_Validator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Yuhyo_DTO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Yuhyo_DTO dto = (Yuhyo_DTO) target;
		String name = dto.getName();
		int age = dto.getAge();
		if(name==null || name.trim().isEmpty()) {
			errors.rejectValue("name", "이름은 공백 안됨");
		}
		if(age<1 || age>150) {
			errors.rejectValue("age", "나이는 1~150까지 입력 가능합니다.");
		}
	}
}
