package by.academy.homework.no4.task2;

import java.util.Scanner;

public class Array4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Generic<Integer> arrInt = new Generic<>(2);		/* массив с заданым размером */

		arrInt.set(0, 1); 								/* вставка по одному элементузаданым размером массива */
		arrInt.set(1, 2);
		System.out.println("arrInt1 - " + arrInt);
		System.out.println("Размер первого массива " + arrInt.getLength()); /* размер массива */

		Generic<Integer> arrInt2 = new Generic<>();
		System.out.println("Размер массива по дефолту " + arrInt2.getLength());
		sc.close();
	}
}
