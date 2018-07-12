package com.gbusiness.swift.types.bind;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author JOSEPH BAKING
 */
public class DateTimeAdapter {

	public static String unmarshal(Calendar v) {
		return getDateFormat().format(v.getTime());
	}

	public static Calendar marshal(String v) {
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(getDateFormat().parse(v));
			return calendar;
		} catch (ParseException e) {
			throw new IllegalArgumentException(e);
		}
	}

	private static DateFormat getDateFormat() {
		return new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss.SSSXXX");
	}

}
