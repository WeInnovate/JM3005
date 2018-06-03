package com.jm3005.learn.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ModelNumberValidator implements ConstraintValidator<ModelNumber, String> {

	private String modelNumberPrefix;

	public void initialize(ModelNumber modelNumber) {
		this.modelNumberPrefix = modelNumber.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean retVal = false;

		if (value != null) {
			retVal = value.startsWith(modelNumberPrefix);
		} else {
			retVal = true;
		}

		return retVal;
	}

}
