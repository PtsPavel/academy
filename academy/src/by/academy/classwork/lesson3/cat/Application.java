package by.academy.classwork.lesson3.cat;

public class Application {

	public static void main(String... args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		System.out.println("cat1");
		cat1.eat();
		cat1.grow();
		cat1.walk();
		cat1.sleep();
		System.out.println("cat2");
		cat2.eat();
		cat2.grow();
		cat2.grow();
		cat2.grow();
		cat1.walk();
		cat1.sleep();
		System.out.println(cat2.getAge());
		// TODO Auto-generated method stub
	}
}
