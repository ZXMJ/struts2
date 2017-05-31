package com.ultra.validator;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

/**
 * @ClassName: IDCardValidator
 * @Description: 自定义验证器需要实现Validator接口(具体继承FieldValidatorSupport(属性验证)
 *               或者ValidatorSupport(一般验证))。
 * @author fanbaoshen
 * @date 2017年4月26日 下午5:56:27
 * 
 * @version 5.0
 */
public class IDCardValidator extends FieldValidatorSupport {

	@Override
	public void validate(Object object) throws ValidationException {
		String fieldName = getFieldName();
		Object value = this.getFieldValue(fieldName, object);
		IDCard idCard = new IDCard();
		boolean result = idCard.Verify((String) value);
		if (!result) {
			addFieldError(fieldName, object);
		}
	}

}
