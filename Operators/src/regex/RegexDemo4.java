package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {

	public static void main(String[] args) {
		
		System.out.println(regexSearchCount("One two three раз два три one1 two2 123 "));
		
	}
	
	public static int regexSearchCount(String str) {
		String regexExpression = "[a-zA-Z]+\\b";
		Pattern pattern = Pattern.compile(regexExpression);
		Matcher matcher = pattern.matcher(str);
		int res = 0;
		
		while(matcher.find()) {
			System.out.println(matcher.group());
			res++;
		}
		
		return res;
	}

}
