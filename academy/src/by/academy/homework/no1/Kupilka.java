package by.academy.homework.no1;

import java.util.Scanner;

public class Kupilka {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double sum;
        System.out.println("������� ����� ������� ��� ������: ");
        sum = num.nextDouble();

        if (sum < 100) {
            double sumPokupki = sum - ((sum / 100) * 5);
            System.out.println("����� ������� �� ������� = " + sumPokupki);
        } else if (sum >= 100 && sum < 200) {
            double sumPokupki = sum - ((sum / 100) * 7);
            System.out.println("����� ������� �� ������� = " + sumPokupki);
        } else if (sum >= 200 && sum < 300) {
            Scanner num1 = new Scanner(System.in);
            short age;
            System.out.println("������� ���� ������ ���������� ���: ");
            age = num.nextShort();

            if (age > 18) {
                double sumPokupki = sum - ((sum / 100) * 16);
                System.out.println("����� ������� �� ������� = " + sumPokupki);
            } else {
                double sumPokupki = sum - ((sum / 100) * 8);
                System.out.println("����� ������� �� ������� = " + sumPokupki);
            }

        }
        if (sum >= 300 && sum < 400) {
            double sumPokupki = sum - ((sum / 100) * 15);
            System.out.println("����� ������� �� ������� = " + sumPokupki);
        } else if (sum >= 400) {
            double sumPokupki = sum - ((sum / 100) * 20);
            System.out.println("����� ������� �� ������� = " + sumPokupki);
        }
    }
}
