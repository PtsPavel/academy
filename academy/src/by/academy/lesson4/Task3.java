package by.academy.lesson4;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// Составьте программу,
		// которая вычисляет произведение чисел от 1 до n.n вводится с клавиатуры.
		Scanner num = new Scanner(System.in).useLocale(Locale.ENGLISH);
		System.out.println("Введите целочисленное значение : ");
		long n = num.nextInt();

		String s = "";

		for (long j = 1; j < (n + 1); j++) {
			for (long i = 1; i < (n + 1); i++)
				s += (Long.toString(j) + "*" + Long.toString(i) + "=" + Long.toString(i * j) + "\n");
		}
		System.out.println(s);
	}
}
