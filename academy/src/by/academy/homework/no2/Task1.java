package by.academy.homework.no2;

import java.util.Scanner;

//Ввести две строки с консоли. Определить, является ли одна строка перестановкой символов другой строки. Учитываем регистр. Не использовать сортировку :)
//Например:
//1.	“hello” и “hlleo” -> true
//2.	“hello” и “art” -> false

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите две строки:");
        String str1 = sc.next();
        String str2 = sc.next();
        int[] compare = new int[256];
        boolean result = true;

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                compare[str1.charAt(i)]++;
                compare[str2.charAt(i)]--;
            }
        } else {
            System.out.println("Длина строк не совпадает");
            result = false;
        }
        for (int i = 0; i < compare.length; i++) {
            if (compare[i] != 0) {
                System.out.println("Строки содержат разные символы");
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Строки состоят из одинаковых символов");
        }
        sc.close();
    }
}