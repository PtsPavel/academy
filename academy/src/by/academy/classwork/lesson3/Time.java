package by.academy.classwork.lesson3;

public class Time {

	public static void main(String[] args) {
		int s = 370000;
		int sec;
		int m;
		int min;
		int h;
		int hrs;
		int days;
		int d;
		int weeks;
		int w;
		sec = s % 60;
		
		m = (s - sec) / 60;
		min = m % 60;
		
		h = (m - min) / 60;
		hrs = h % 24;
		d = (h - hrs) / 24;
		days = h % 7;
		
		w = (d - days) / 7;
		
		
		
		System.out.println(w + " ������ " + days + " ���� " + hrs + " ����� " + min + " ����� " + sec + " ������ ");
		
		// TODO Auto-generated method stub

	}

}
