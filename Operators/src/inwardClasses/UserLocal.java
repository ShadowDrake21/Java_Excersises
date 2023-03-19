package inwardClasses;

public class UserLocal {
	private String login, password;
	
	class Query {
		public void printToLog() {
			System.out.println("������������ � ������� " + login + " � ������� " + password + " �������� ������");
		}
	}
	
	public void createQuery() {
		Query query = new Query();
		query.printToLog();
	}

	public UserLocal(String login, String password) {
		this.login = login;
		this.password = password;
	}
}
