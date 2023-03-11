package string;

public class MiddleSymbols {

	public static void main(String[] args) {
		System.out.println("��� ������� ����� ������ \"string\": " + middle("string"));
		System.out.println("��� ������� ����� ������ \"code\": " + middle("code"));
		System.out.println("��� ������� ����� ������ \"Practice\": " + middle("Practice"));
	}

	public static String middle(String st) {
		StringBuilder sb = new StringBuilder(st);
		String result = null;
		
		if(sb.length() % 2 == 0) {
			int pos = sb.length() / 2;
			result = sb.substring(pos-1, pos + 1);
		}
		
		return result;
		
	}
}
