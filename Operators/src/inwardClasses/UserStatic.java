package inwardClasses;

public class UserStatic {
	private static String login, password;

	static class Query {
		public void printToLog() {
			System.out.println("������������ � ������� " + login + " � ������� " + password + " �������� ������");
		}
	}

	public void createQuery() {
		Query query = new Query();
		query.printToLog();
	}

	public void setLogin(String log) {
		login = log;
	}
	
	public void setPassword(String pass) {
		password = pass;
	}
}
