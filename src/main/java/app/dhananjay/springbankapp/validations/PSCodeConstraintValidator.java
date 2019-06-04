package app.dhananjay.springbankapp.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PSCodeConstraintValidator implements ConstraintValidator<PSCode, String> {
    public String codePrefix;

    @Override
    public void initialize(PSCode constraintAnnotation) {
        codePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
        if (code != null) {
            return code.startsWith(codePrefix);
        } else {
            return true;
        }
    }
}
