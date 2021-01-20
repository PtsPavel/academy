package by.academy.lesson3;

import java.util.Scanner;

public class Chisla {
	    public static void main(String[] args) {
	        Scanner num = new Scanner(System.in);
	        System.out.print("введите переменные");
	        double a = num.nextDouble();
	        double b = num.nextDouble();
	        
	        if (a > b) {
	        	double c = (a + b) / 2;
	        	System.out.print("среднее арифметическое " + c + " ; a наибольшее число");
	        } else if (b > a){
	        	double d = (a + b) / 2;
	        	System.out.println("среднее арифметическое " + d + " ; b наибольшее число");
	        } else 
	        	System.out.println("числа равны");
	}
}
