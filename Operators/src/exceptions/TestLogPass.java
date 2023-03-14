package exceptions;

public class TestLogPass {

	public static void main(String[] args) {

		String login = "Drake21";
		String password = "iLikeJava_2004";
		String confirmPassword = "iLikeJava_2004";
		
		System.out.println(check(login, password, confirmPassword));
	}
	
	public static boolean check(String login, String password, String confirmPassword) {
		boolean loginRes = checkLogin(login);
		boolean passwordRes = checkPassword(password, confirmPassword);
		
		if(!loginRes || !passwordRes) {
			return false;
		}
		
		return true;
	}
	
	public static boolean checkLogin(String login) {
		if(!login.matches("^[A-Za-z]([.A-Za-z0-9-]{1,18})([A-Za-z0-9])$")) {
			try {
				throw new WrongLoginException("Недопустимые символы!");
			} catch (WrongLoginException e) {
				e.printStackTrace();
			} catch(Exception e1) {
				e1.printStackTrace();
			}
			return false;
		} 
		else if(login.length() >= 20) {
			try {
				throw new WrongLoginException("Длинный логин!");
			} catch (WrongLoginException e) {
				e.printStackTrace();
			} catch(Exception e1) {
				e1.printStackTrace();
			}
			return false;
		}
		
		return true;
	}
	
	public static boolean checkPassword(String password, String confirmPassword) {
		if(password.matches("^[A-Za-z]([.A-Za-z0-9-]{1,18})([A-Za-z0-9])$")) {
			try {
				throw new WrongPasswordException("Недопустимые символы!");
			} catch (WrongPasswordException e) {
				e.printStackTrace();
			} catch(Exception e1) {
				e1.printStackTrace();
			}
			return false;
		} 
		else if(password.length() >= 20) {
			try {
				throw new WrongPasswordException("Длинный пароль!");
			} catch (WrongPasswordException e) {
				e.printStackTrace();
			} catch(Exception e1) {
				e1.printStackTrace();
			}
			return false;
		}
		else if(!password.equals(confirmPassword)) {
			try {
				throw new WrongPasswordException("Пароли не совпадают!");
			} catch (WrongPasswordException e) {
				e.printStackTrace();
			} catch(Exception e1) {
				e1.printStackTrace();
			}
			return false;
		}
		
		return true;
	}
}
