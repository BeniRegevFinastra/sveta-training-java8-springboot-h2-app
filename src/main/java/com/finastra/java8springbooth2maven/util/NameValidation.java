package com.finastra.java8springbooth2maven.util;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NameValidator.class)
public @interface NameValidation {
    String message() default "{name.invalid}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
