package by.academy.classwork.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class StringTask2 {
	public static void main(String[] args) {
		// ¬вести n строк с консоли. ”пор€дочить и вывести строки в пор€дке возрастани€
		// (убывани€)
		// значений их длины.
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите тип данных количесвто строк: ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		
	}
}
