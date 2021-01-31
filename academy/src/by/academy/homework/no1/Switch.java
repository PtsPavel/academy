package by.academy.homework.no1;

import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("������� ��� ������ int, double, float, char ��� String: ");
        String a = num.nextLine();

        switch (a) {
            case "int":
                System.out.println("������� ����� ���������������� ����: ");
                int b = num.nextInt();
                int ost;
                ost = b % 2;
                System.out.println(ost);
                break;
            case "double":
                System.out.println("������� ����� ���������������� ����: ");
                double c = num.nextDouble();
                double proc;
                proc = c / 100 * 70;
                System.out.println(proc);
                break;
            case "float":
                System.out.println("������� ����� ���������������� ����: ");
                float d = num.nextFloat();
                float kv = (float) Math.pow(d, 2);
                System.out.println(kv);
                break;
            case "char":
                System.out.println("������� ���� ������������ ������: ");
                String e = num.nextLine();
                char cod = e.charAt(0);
                int cod1 = (int) cod;
                System.out.println(cod1);
                break;
            case "String":
                System.out.println("������� ������������ ����� ������: ");
                String f = num.nextLine();
                System.out.println("Hello " + f);
                break;
            default:
                System.out.println("Unsupported type");
        }
    }
}
