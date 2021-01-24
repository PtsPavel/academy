package by.academy.lesson4;

public class Task18 {

	public static void main(String[] args) {
//		«адано натуральное число N. Ќайти количество натуральных чисел, 
//		не превосход€щих N и не дел€щихс€ ни на одно из чисел 2
		int number = 256;
		int counter = 0;
		
		for (int i = 0; i <= number; i++) {
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
				System.out.println(i + ",");
				counter++;
			}
			
		}
		System.out.println();
		System.out.println("counter: " + counter);
		// TODO Auto-generated method stub

	}

}
