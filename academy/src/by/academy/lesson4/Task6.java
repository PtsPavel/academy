package by.academy.lesson4;

import java.util.Locale;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		// 6. В сберкассу на трёхпроцентный вклад положили S рублей.
		// Какой станет сумма вклада через N лет.
		Scanner num = new Scanner(System.in).useLocale(Locale.ENGLISH);
		System.out.println("Введите сумму : ");
		double s = num.nextDouble();
		System.out.println("Введите количество лет : ");
		double n = num.nextDouble();

		for (double i = 0; i < n; i++) {
			s += (s * 0.03);
		}
		System.out.println(s);
	}
}
