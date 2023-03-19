package inwardClasses;

public class UserTest {

	public static void main(String[] args) {
		User user = new User("Dmytro21", "12345");
		user.createQuery();
		
		User.Query query1 = user.new Query();
		query1.printToLog();
		
		User.Query query2 = new User("Alena1", "1dgdfgdfgwer453").new Query();
		query2.printToLog();
	}

}
