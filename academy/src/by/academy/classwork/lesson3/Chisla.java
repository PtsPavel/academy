package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Chisla {
	    public static void main(String[] args) {
	        Scanner num = new Scanner(System.in);
	        System.out.print("������� ����������");
	        double a = num.nextDouble();
	        double b = num.nextDouble();
	        
	        if (a > b) {
	        	double c = (a + b) / 2;
	        	System.out.print("������� �������������� " + c + " ; a ���������� �����");
	        } else if (b > a){
	        	double d = (a + b) / 2;
	        	System.out.println("������� �������������� " + d + " ; b ���������� �����");
	        } else 
	        	System.out.println("����� �����");
	}
}
