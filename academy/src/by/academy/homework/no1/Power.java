package by.academy.homework.no1;

public class Power {

	public static void main(String[] args) {
		// Выводить на консоль степень двойки, пока результат не будет больше, чем
		// 1_000_000.
		int number = 2;
		int power = 0;

		while ((int) Math.pow(number, power) < 1000000) {
			System.out.println(power);
			power++;

		}
	}
}
