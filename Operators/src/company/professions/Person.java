package company.professions;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person {
	private String fullName;
	private LocalDate birthday;
	private Period age;
	
	
	public void setAge() {
		age = Period.between(LocalDate.now(), birthday);
	}
}
