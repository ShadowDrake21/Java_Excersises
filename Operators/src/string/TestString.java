package string;

public class TestString {

	public static void main(String[] args) {
		testString("I like Java!");
		testString("I like C++ and Java!");
		testString("I hate .Net!");
	}
	
	public static void testString(String string) {
		System.out.println("����������� ������: " + string);
		
		System.out.println(string.charAt(string.length() - 1));
		
		if(string.endsWith("!!!")) {
			System.out.println("������ ������������� �� !!!");
		} else {
			System.out.println("������ �� ������������� �� !!!");
		}
		
		if(string.startsWith("I like")) {
			System.out.println("������ ���������� �� I like");
		} else {
			System.out.println("������ �� ���������� �� I like");
		}
		
		System.out.println("������ �������� ��������� Java -> " + string.contains("Java"));
		
		if(string.contains("Java")) {
			System.out.println("������� ��������� Java: " + string.indexOf("Java"));
		}
		
		String changedString = string.replace("a", "o");
		System.out.println("�������� ������: " + string);
		System.out.println("���������� ������: " + changedString);
		
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		
		if(string.contains("Java")) {
			System.out.println("���������� ��������� Java: " + string.substring(string.indexOf("Java"), string.length() - 1));
		}
		
		System.out.println();
	}

}
