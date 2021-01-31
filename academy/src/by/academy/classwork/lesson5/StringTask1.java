package by.academy.classwork.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class StringTask1 {

	public static void main(String[] args) {
		// 1. ¬вести n строк с консоли, найти самую короткую и самую длинную строки.
		// ¬ывести найденные строки и их длину.
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите тип данных количесвто строк: ");
		int n = sc.nextInt();

		String[] arr = new String[n];
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		int min = arr[0].length();
		int max = arr[0].length();
		String maxString = arr[0];
		String minString = arr[0];

		for (int i = 0; i < n; i++) {
			if (arr[i].length() < min) {
				min = arr[i].length();
				minString = arr[i];
			} else if (arr[i].length() < max) {
				max = arr[i].length();
				maxString = arr[i];
			}
		}
		System.out.println("Min: " + min);
		System.out.println("Min string: " + minString);
		System.out.println("Max: " + max);
		System.out.println("Max string: " + maxString);

	}

}
