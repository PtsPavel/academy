package by.academy.homework.no2;

import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int quantity = 5;
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите количество игроков (от 2-х до 10 включительно) ");
        int players = console.nextInt();

        if (players < 2 || players > 10) {
            while (players < 2 || players > 10) {
                System.out.println("Вы ввели " + players + "10 ,необходимо от 2-х до 10 включительно ");
                players = console.nextInt();
            }
        }
        String[] card = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};
        String[] type = {"пики", "трефы", "червы", "бубны"};
        String[] playerCards = new String[card.length * type.length];

        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < type.length; j++) {
                playerCards[type.length * i + j] = card[i] + " " + type[j];
            }
        }
        for (int a = 0; a < players; a++) {
            System.out.println();
            System.out.println("Карты игрока №" + (a + 1) + ":");
            for (int b = 0; b < quantity; b++) {
                int rnd = random.nextInt(52);
                String cardType = playerCards[rnd];
                System.out.println(cardType);
            }
        }
    }
}


