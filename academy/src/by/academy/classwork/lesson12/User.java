package by.academy.classwork.lesson12;

public class User {

	private String login;
	private String password;

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public void createQuery() {
		Query q = new Query(this);
		q.printToLog();
	}

	public static class Query {
		User user;

		public Query(User user) {
			this.user = user;
		}

		public void printToLog() {
			System.out.println("User - " + user.login);
		}

	}
}
