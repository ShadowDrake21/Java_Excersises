package inwardClasses;

public class UserStaticTest {

	public static void main(String[] args) {
		UserStatic user = new UserStatic();
		user.setLogin("Dmytro21");
		user.setPassword("12345");
		user.createQuery();
	}

}
