package string;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employees[] = {new Employee("������ �.�.", 2005.4), 
				new Employee("����� �.�.", 5675.4), 
				new Employee("����������� �.�.", 6045)};
		Report.generateReport(employees);
	}

}
