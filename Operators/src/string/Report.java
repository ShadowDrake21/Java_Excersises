package string;

import java.util.Formatter;

public class Report {
	public static void generateReport(Employee employees[]) {
		Formatter formatter = new Formatter();
		for(Employee employee : employees) {
			formatter.format("Роботник %s %10.2f\n", employee.getFullname(), employee.getSalary());
		}
		
		System.out.println(formatter);
	}
}
