package by.academy.homework.no2;

import java.util.Scanner;
//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество слов");
        int n = sc.nextInt();
        String[] arr = new String[n];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        String str = arr[0];
        int strLength = arr[0].length();
        for (int i = 0; i < n; i++) {
            StringBuilder stBuilder = new StringBuilder();
            for (int j = 0; j < arr[i].length(); j++) {
                if (stBuilder.toString().indexOf(arr[i].charAt(j)) == -1) {
                    stBuilder.append(arr[i].charAt(j));
                }
            }
            if (stBuilder.length() < strLength) {
                strLength = stBuilder.length();
                str = arr[i];
            }
        }
        sc.close();
        System.out.println("Минимальное количество различных символов в слове : " + str);
    }
}
