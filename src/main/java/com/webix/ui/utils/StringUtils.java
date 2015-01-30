package com.webix.ui.utils;


public abstract class StringUtils {
    public static String enumToCamelCase(String enumName) {
	StringBuffer result = new StringBuffer();
	String[] sa = enumName.split("_");
	if (sa.length > 0) {
	    result.append(sa[0].toLowerCase());
	    for (int i = 1; i < sa.length; i++) {
		String s = sa[i];
		if (s.length() > 0) {
		    result.append(Character.toUpperCase(s.charAt(0)));
		    result.append(s.substring(1));
		}
	    }
	}
	return result.toString();
    }

    public static String camelCaseToEnum(String name) {
	StringBuffer result = new StringBuffer();
	if (name.length() > 0) {
	    result.append(Character.toUpperCase(name.charAt(0)));
	    for (int i = 1, c = name.length(); i < c; i++) {
		char ch = name.charAt(i);
		if (Character.isLowerCase(name.charAt(i - 1))
			&& Character.isUpperCase(ch)) {
		    result.append('_');
		}
		result.append(Character.toUpperCase(ch));
	    }
	}
	return result.toString();
    }
}
