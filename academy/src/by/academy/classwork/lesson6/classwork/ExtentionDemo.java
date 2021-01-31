package by.academy.classwork.lesson6.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtentionDemo {

	public static void main(String[] args) {
		String text = "2. Имеется строка с текстом! Подсчитать количество слов в тексте. Желательно\r\n"
				+ "учесть, что слова могут разделяться несколькими пробелами, в начале и конце\r\n"
				+ "текста также могут быть пробелы, но могут и отсутствовать?";
		
		String regex = "[//.,!?;]";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		
		int counter = 0;
		while (m.find() ) {
			counter++;
			System.out.println(text.substring(m.start(), m.end()));
		}
		System.out.println();
		System.out.println(counter);
		// TODO Auto-generated method stub
	}

}
