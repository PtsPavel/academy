package by.academy.classwork.lesson6.classwork;

import java.util.regex.Pattern;

public class RegExpTask6 {
	static Pattern p = Pattern.compile("\\w+@\\w+\\.{1}\\w+");
	
	public static void main(String[] args) {
		String s = "  _123test@_mail._123ru";
		System.out.println(validate(s));
	}
	
	private static boolean validate(String s) {
		s = s.trim();
		return p.matcher(s).matches();
				
	}

}
