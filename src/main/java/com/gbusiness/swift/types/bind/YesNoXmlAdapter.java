package com.gbusiness.swift.types.bind;

/**
 * @author JOSEPH BAKING
 */
public class YesNoXmlAdapter {

	public static String unmarshal(Boolean v) {
		return v == null || !v ? "N" : "Y";
	}

	public static Boolean marshal(String v) {
		return v == null ? false : "Y".equalsIgnoreCase(v);
	}

}
