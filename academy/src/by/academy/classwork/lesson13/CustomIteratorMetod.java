package by.academy.classwork.lesson13;

public class CustomIteratorMetod {
	
	public static void main(String[] args) {
		
		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer[] array1 = {null, null, null};
		ArrayIterator<Integer> arrIterator = new ArrayIterator<Integer>(array);
		
		while (arrIterator.hasNext()) {
			Integer i = arrIterator.next();
			System.out.println(i);
		}
	}

}
