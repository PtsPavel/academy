package by.academy.classwork.lesson12;

public class Task1 {

	public static void main(String[] args) {
		User user = new User("User", "123");
		
		User.Query q = new User.Query(user);
		q.printToLog();
	}
}
