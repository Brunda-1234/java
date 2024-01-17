package com.te.basic.programs.strings;

public class Pst {

	public static void main(String[] args) {
		
		Object n = null;
		String s = "dgrue";
		System.err.println(s.compareTo(null));
		/*
		 * Exception in thread "main" java.lang.NullPointerException:
		 *  Cannot read field "value" because "anotherString" is null
	at java.base/java.lang.String.compareTo(String.java:2017)
	at basic_programs/com.te.basic.programs.strings.Pst.main(Pst.java:8)
		 */
	}
}
