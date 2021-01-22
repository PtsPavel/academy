package by.academy.homework.no2;

import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("¬ведите тип данных int, double, float, char или String: ");
        String a = num.nextLine();

        switch (a) {
            case "int":
                System.out.println("¬ведите число соответствующего типа: ");
                int b = num.nextInt();
                int ost;
                ost = b % 2;
                System.out.println(ost);
                break;
            case "double":
                System.out.println("¬ведите число соответствующего типа: ");
                double с = num.nextDouble();
                double proc;
                proc = с / 100 * 70;
                System.out.println(proc);
                break;
            case "float":
                System.out.println("¬ведите число соответствующего типа: ");
                float d = num.nextFloat();
                float kv = (float) Math.pow(d, 2);
                System.out.println(kv);
                break;
            case "char":
                System.out.println("¬ведите один произвольный символ: ");
                String e = num.nextLine();
                char cod = e.charAt(0);
                int cod1 = (int) cod;
                System.out.println(cod1);
                break;
            case "String":
                System.out.println("¬ведите произвольный набор данных: ");
                String f = num.nextLine();
                System.out.println("Hello " + f);
                break;
            default:
                System.out.println("Unsupported type");
        }
    }
}
