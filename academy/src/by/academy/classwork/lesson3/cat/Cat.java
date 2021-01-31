package by.academy.classwork.lesson3.cat;

public class Cat {
	int age;
	String nickname;
	
	public Cat() {
		super();
	}
	
	public Cat(String nickname){
		super();
		this.nickname = nickname;
	}
	public Cat(int age, String nickname){
		super();
		this.age = age;
		this.nickname = nickname;
	}

	public void grow() {
		age++;
	}
	public void sleep() {
		System.out.println("sleep");
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void eat() {
		System.out.println("eat");
	}
	public void walk() {
		System.out.println("walk");
	}

}
