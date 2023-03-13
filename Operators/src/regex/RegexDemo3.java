package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {
		
		System.out.println("google.com = " + test("google.com"));
		System.out.println("reference1.ua = " + test("reference1.ua"));
		System.out.println("reference1.org = " + test("reference1.org"));
		System.out.println("thebeatles.uk = " + test("thebeatles.uk"));
	}
	
	public static boolean test(String testString) {
		Pattern pattern = Pattern.compile(".+\\.(com|ua|ru|org)");
		Matcher matcher = pattern.matcher(testString);
		return matcher.matches();
	}

}
