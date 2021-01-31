package by.academy.classwork.lesson6.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		//ƒана строка:
		//" Hey      There!     How      Are you doing"   ;
		//оставить лишь 1 пробел между слов.
		String str = " Hey      There!     How      Are you doing";
		
        System.out.println(str.replaceAll("\\s+" , " ").trim());
	}

}
