package by.academy.classwork.lesson10;

public class ApplicationNoGenericBox {

	public static void main(String[] args) {

		NoGeneticBox<Cat> b1 = new NoGeneticBox<>(new Cat());
		System.out.println(b1);

	}

}
