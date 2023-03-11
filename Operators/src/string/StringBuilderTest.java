package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = appendString(3, 56);
		StringBuilder sb1 = new StringBuilder(sb);
		System.out.println(sb);
		
		System.out.println("После замены = на равно 1: \n" + replaceSymbols1(sb));
		System.out.println("После замены = на равно 2: \n" + replaceSymbols2(sb1));

	}
	
	public static StringBuilder appendString(int a, int b) {
		StringBuilder sb = new StringBuilder();
		sb.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
		.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n")
		.append(a).append(" * ").append(b).append(" = ").append(a * b);
		
		return sb;
	}
	
	public static StringBuilder replaceSymbols1(StringBuilder sb) {
		for(int i = 0; i < 3; i++) {
			int position = sb.indexOf("=");
			sb.deleteCharAt(position);
			sb.insert(position, "равно");	
		}
		return sb;
	}

	public static StringBuilder replaceSymbols2(StringBuilder sb) {
		for(int i = 0; i < 3; i++) {
			int position = sb.indexOf("=");
			sb.replace(position, position + 1, "равно");
		}
		return sb;
	}
}
