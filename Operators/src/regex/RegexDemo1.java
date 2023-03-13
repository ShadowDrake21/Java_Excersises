package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		
		regexTest("Versions: Java  5, Java 6, Java   7, Java 8, Java 12.");
	}
	
	public static void regexTest(String str) {
		String patternString = "Java\\s+\\d{1,2}";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(str);
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
