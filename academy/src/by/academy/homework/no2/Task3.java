package by.academy.homework.no2;

//Условие здачи: ввести 2 слова, состоящие из четного числа букв. Получить слово состоящее из первой половины первого слова и второй половины второго слова.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку c четным количеством символов:");
        String str1 = sc.next();
        System.out.println("Введите вторую строку c четным количеством символов:");
        String str2 = sc.next();

        if (str1.length() % 2 != 0) { //введено два if для того, чтобы пользователь понимал сразу, где ошибся, можно один if через ||
            System.out.println("Количество символов первой строки не являеся четным. Повторите попытку.");
        }
        if (str2.length() % 2 != 0) {
            System.out.println("Количество символов второй строки не являеся четным. Повторите попытку.");
        }
        int firstPart = str1.length() / 2;
        int secondPart = str2.length() / 2;
        System.out.println(str1.substring(0, firstPart) + str2.substring(secondPart));
    }
}
