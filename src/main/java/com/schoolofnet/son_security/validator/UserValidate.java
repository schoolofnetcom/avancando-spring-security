package com.schoolofnet.son_security.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.schoolofnet.son_security.models.User;
import com.schoolofnet.son_security.service.UserService;

@Component
public class UserValidate implements Validator {

	@Autowired
	private UserService userService;
	
	@Override
	public boolean supports(Class<?> klazz) {
		return User.class.equals(klazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		User user = (User) obj;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "notEmpty");
		
		if (userService.findByUsername(user.getUsername()) != null) {
			errors.rejectValue("username", "duplicate");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "notEmpty");
	}

}
