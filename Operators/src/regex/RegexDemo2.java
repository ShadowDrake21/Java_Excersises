package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		String patternExprassion = "c+ab";
		Pattern pattern = Pattern.compile(patternExprassion);
		
		String matcherExpression = "cccab";
		Matcher matcher = pattern.matcher(matcherExpression);
		boolean b = matcher.matches();
		
		System.out.println(b);
	}

}
