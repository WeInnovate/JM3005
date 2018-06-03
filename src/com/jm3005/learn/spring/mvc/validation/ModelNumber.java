package com.jm3005.learn.spring.mvc.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = ModelNumberValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface ModelNumber {

	String value() default "MOD";

	String message() default " prefix should be MOD";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};
}
