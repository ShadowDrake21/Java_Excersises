package string;

import java.util.Formatter;

public class Students {

	public static void main(String[] args) {
		formatter("��������", 95, "���� ������");
		formatter("���������", 100, "���");
		formatter("����������", 90, "������������� ������");
	}
	
	public static void formatter(String fio, int mark, String subject) {
//		System.out.printf("������� %.15s ������� %3d �� %10s", fio, mark, subject);
		Formatter form = new Formatter();
		form.format("������� %s ������� %d �� %s", fio, mark, subject);
		System.out.println(form);
	}

}
