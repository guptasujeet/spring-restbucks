package org.springsource.restbucks.validator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ClassUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springsource.restbucks.order.Item;

/**
 * Date: 3/21/13
 * Time: 1:01 PM
 */
@Slf4j
public class ItemValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return ClassUtils.isAssignable(aClass, Item.class);
    }

    @Override
    public void validate(Object o, Errors errors) {
        log.debug("Inside ->" + getClass().getSimpleName());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required", "Item name required");
    }
}
