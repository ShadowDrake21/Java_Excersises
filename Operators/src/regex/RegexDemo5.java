package regex;

public class RegexDemo5 {

	public static void main(String[] args) {
		
		String str = "fffff ab f 1234 jkjk";
		System.out.println(regexMinWorld(str));
	}

	public static String regexMinWorld(String str) {
		String[] strArr = str.split(" ");
		String minWord = strArr[0];
		long numOfChar;
		
		for(int i = 0; i < strArr.length; i++) {
			numOfChar = strArr[i].chars().distinct().count();
			if(numOfChar < minWord.chars().distinct().count()) {
				minWord = strArr[i];
			}
		}
		
		return minWord;
	}
}
