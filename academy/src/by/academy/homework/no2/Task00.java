package by.academy.homework.no2;

import java.io.IOException;
import java.util.Scanner;

public class Task00 {
    static int pairs(int k, int[] arr) {
        int pairsCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Введите через пробел количество элементов массива от 2 до 10^5 включительно и значение от 1 до 10^9: ");
        String[] nk = scanner.nextLine().split(" ");
        System.out.println("Введите значения элементов массива от 1 до ((2^31)-1): ");
        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
        }

        int result = pairs(k, arr);
        System.out.println(result);

        scanner.close();
    }
}