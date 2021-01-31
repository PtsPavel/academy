package by.academy.classwork.lesson4;

public class Test12 {

	public static void main(String[] args) {
		// ����� ������������ ���������� �������� ����� ������� 13

		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				if (i % 2 == 1 && i % 13 == 0 && j % 2 == 1 && j % 13 == 0) {
					int s = i * j;
					System.out.println(s);
				}
			}
		}
	}

}
