package inwardClasses;

public class User {
	private String login, password;
	
	public class Query {
		public void printToLog() {
			System.out.println("������������ � ������� " + login + " � ������� " + password + " �������� ������");
		}
	}
	
	public void createQuery() {
		Query query = new Query();
		query.printToLog();
	}

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}
}
