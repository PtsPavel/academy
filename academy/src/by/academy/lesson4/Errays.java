package by.academy.lesson4;

import java.util.Random;

public class Errays {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
			System.out.println(arr[i] + "i");
		}

		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int n = 0; n < arr.length; n++) {
				temp = arr[i];
				arr[i] = arr[n];
				arr[n] = temp;
			}
		}
		System.out.println("\n");
		for (int i : arr) {
			System.out.println(i + " ");
		}

	}

}
