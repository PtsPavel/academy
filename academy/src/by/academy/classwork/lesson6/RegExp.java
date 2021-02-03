package by.academy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		//���� ������:
		//" Hey      There!     How      Are you doing"   ;
		//�������� ���� 1 ������ ����� ����.
		String str = " Hey      There!     How      Are you doing";
		
        System.out.println(str.replaceAll("\\s+" , " ").trim());
	}

}
