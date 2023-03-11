package string;

public class TestString {

	public static void main(String[] args) {
		testString("I like Java!");
		testString("I like C++ and Java!");
		testString("I hate .Net!");
	}
	
	public static void testString(String string) {
		System.out.println("Проверяемая строка: " + string);
		
		System.out.println(string.charAt(string.length() - 1));
		
		if(string.endsWith("!!!")) {
			System.out.println("Строка заканчивается на !!!");
		} else {
			System.out.println("Строка не заканчивается на !!!");
		}
		
		if(string.startsWith("I like")) {
			System.out.println("Строка начинается на I like");
		} else {
			System.out.println("Строка не начинается на I like");
		}
		
		System.out.println("Строка содержит подстроку Java -> " + string.contains("Java"));
		
		if(string.contains("Java")) {
			System.out.println("Позиция подстроки Java: " + string.indexOf("Java"));
		}
		
		String changedString = string.replace("a", "o");
		System.out.println("Исходная строка: " + string);
		System.out.println("Измененная строка: " + changedString);
		
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		
		if(string.contains("Java")) {
			System.out.println("Вырезанная подстрока Java: " + string.substring(string.indexOf("Java"), string.length() - 1));
		}
		
		System.out.println();
	}

}
