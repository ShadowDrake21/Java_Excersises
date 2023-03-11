package string;

import java.util.Formatter;

public class Students {

	public static void main(String[] args) {
		formatter("Игнатьев", 95, "Базы данных");
		formatter("Оленьенко", 100, "ООП");
		formatter("Маринський", 90, "Моделирование систем");
	}
	
	public static void formatter(String fio, int mark, String subject) {
//		System.out.printf("Студент %.15s получил %3d по %10s", fio, mark, subject);
		Formatter form = new Formatter();
		form.format("Студент %s получил %d по %s", fio, mark, subject);
		System.out.println(form);
	}

}
