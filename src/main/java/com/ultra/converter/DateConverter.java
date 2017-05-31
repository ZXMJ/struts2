package com.ultra.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.StrutsTypeConverter;

public class DateConverter extends StrutsTypeConverter {

	private DateFormat format;

	public DateConverter() {
		System.out.println("DateConverter....");
	}

	public DateFormat getDateFormat() {
		if (format == null) {
			String pattern = ServletActionContext.getServletContext().getInitParameter("pattern");
			format = new SimpleDateFormat(pattern);
		}
		return format;
	}

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		if (toClass == Date.class) {
			if (values != null && values.length > 0) {
				try {
					return getDateFormat().parse(values[0]);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
		return values;
	}

	@Override
	public String convertToString(Map context, Object o) {
		if (o instanceof Date) {
			Date date = (Date) o;
			return getDateFormat().format(date);
		}
		return null;
	}

}
