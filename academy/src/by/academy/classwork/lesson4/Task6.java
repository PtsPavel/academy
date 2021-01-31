package by.academy.classwork.lesson4;

import java.util.Locale;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		// 6. � ��������� �� ������������� ����� �������� S ������.
		// ����� ������ ����� ������ ����� N ���.
		Scanner num = new Scanner(System.in).useLocale(Locale.ENGLISH);
		System.out.println("������� ����� : ");
		double s = num.nextDouble();
		System.out.println("������� ���������� ��� : ");
		double n = num.nextDouble();

		for (double i = 0; i < n; i++) {
			s += (s * 0.03);
		}
		System.out.println(s);
	}
}
