package by.academy.classwork.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class StringTask2 {
	public static void main(String[] args) {
		// ������ n ����� � �������. ����������� � ������� ������ � ������� �����������
		// (��������)
		// �������� �� �����.
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��� ������ ���������� �����: ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		
	}
}
