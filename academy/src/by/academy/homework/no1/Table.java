package by.academy.homework.no1;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Table {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner num = new Scanner(System.in).useLocale(Locale.ENGLISH);
		System.out.println("Введите целочисленное значение от 1 до 9 : ");
		int a = num.nextInt();

		String s = "";

		switch (a) {
		case 1:
			int i = 1;
			for (int j = 1; j < 10; j++) {
				s += (Integer.toString(i) + "*" + Integer.toString(j) + "=" + Integer.toString(i * j) + "\n");
			}
			System.out.println(s);
			break;
		case 2:
			int b = 2;
			for (int j = 1; j < 10; j++) {
				s += (Integer.toString(b) + "*" + Integer.toString(j) + "=" + Integer.toString(b * j) + "\n");
			}
			System.out.println(s);
			break;
		case 3:
			int c = 3;
			for (int j = 1; j < 10; j++) {
				s += (Integer.toString(c) + "*" + Integer.toString(j) + "=" + Integer.toString(c * j) + "\n");
			}
			System.out.println(s);
			break;
		case 4:
			int d = 4;
			for (int j = 1; j < 10; j++) {
				s += (Integer.toString(d) + "*" + Integer.toString(j) + "=" + Integer.toString(d * j) + "\n");
			}
			System.out.println(s);
			break;
		case 5:
			int e = 5;
			for (int j = 1; j < 10; j++) {
				s += (Integer.toString(e) + "*" + Integer.toString(j) + "=" + Integer.toString(e * j) + "\n");
			}
			System.out.println(s);
			break;
		case 6:
			int f = 6;
			for (int j = 1; j < 10; j++) {
				s += (Integer.toString(f) + "*" + Integer.toString(j) + "=" + Integer.toString(f * j) + "\n");
			}
			System.out.println(s);
			break;
		case 7:
			int g = 7;
			for (int j = 1; j < 10; j++) {
				s += (Integer.toString(g) + "*" + Integer.toString(j) + "=" + Integer.toString(g * j) + "\n");
			}
			System.out.println(s);
			break;
		case 8:
			int h = 8;
			for (int j = 1; j < 10; j++) {
				s += (Integer.toString(h) + "*" + Integer.toString(j) + "=" + Integer.toString(h * j) + "\n");
			}
			System.out.println(s);
			break;
		case 9:
			int k = 9;
			for (int j = 1; j < 10; j++) {
				s += (Integer.toString(k) + "*" + Integer.toString(j) + "=" + Integer.toString(k * j) + "\n");
			}
			System.out.println(s);
			break;
		}
	}
}
