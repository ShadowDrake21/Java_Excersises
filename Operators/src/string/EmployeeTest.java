package string;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employees[] = {new Employee("Иванов Д.Е.", 2005.4), 
				new Employee("Репка А.Е.", 5675.4), 
				new Employee("Сливинтська К.М.", 6045)};
		Report.generateReport(employees);
	}

}
