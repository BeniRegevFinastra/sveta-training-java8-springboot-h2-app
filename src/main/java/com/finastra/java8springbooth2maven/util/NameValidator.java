package com.finastra.java8springbooth2maven.util;







import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class NameValidator implements ConstraintValidator<NameValidation,String> {

    private String regex = "^[a-zA-Z]{2,}";
    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {
       Pattern pattern = Pattern.compile(regex);
       return pattern.matcher(name).matches();
    }
}
