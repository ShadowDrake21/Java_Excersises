package inwardClasses;

public class UserLocalTest {

	public static void main(String[] args) {
		UserLocal user = new UserLocal("Dmytro21", "12345");
		user.createQuery();
		
		UserLocal.Query query1 = user.new Query();
		query1.printToLog();
		
		UserLocal.Query query2 = new UserLocal("Alena1", "1dgdfgdfgwer453").new Query();
		query2.printToLog();
	}

}
