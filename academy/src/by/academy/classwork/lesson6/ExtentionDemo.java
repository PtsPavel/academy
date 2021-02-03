package by.academy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtentionDemo {

	public static void main(String[] args) {
		String text = "2. ������� ������ � �������! ���������� ���������� ���� � ������. ����������\r\n"
				+ "������, ��� ����� ����� ����������� ����������� ���������, � ������ � �����\r\n"
				+ "������ ����� ����� ���� �������, �� ����� � �������������?";
		
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
