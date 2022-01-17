package com.finastra.java8springbooth2maven.validate;

import com.finastra.java8springbooth2maven.model.Course;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class CourseValidation implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Course.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Course course = (Course) target;

        if (errors.getErrorCount() == 0) {
            ValidationUtils.rejectIfEmptyOrWhitespace(
                    errors, "name",
                    "error.name",
                    "Name is required.");

            if (course.getSemester() > 2) {
                ValidationUtils.rejectIfEmptyOrWhitespace(
                        errors, "preliminaryCourse",
                        "error.preliminaryCourse",
                        "preliminaryCourse name is required.");
            }
        }
    }
}
