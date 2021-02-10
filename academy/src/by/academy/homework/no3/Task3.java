package by.academy.homework.no3;

import java.util.regex.Pattern;
import java.util.Scanner;

//Написать класс, который проверял бы введенную дату на соответствие патерна: (использовать regexp)
//   a) dd/MM/yyyy
//   b) dd-MM-yyyy
public class Task3 {
    static Pattern p = Pattern.compile("\\d[1,31]+/{1}\\d[1,12]+/{1}\\d[1900,]");

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the data (format dd/MM/yyyy):");
        String str = s.next();

        System.out.println(validate(str));
    }

    private static boolean validate(String str) {

            str = str.trim();
            return p.matcher(str).matches();

        }
    }


