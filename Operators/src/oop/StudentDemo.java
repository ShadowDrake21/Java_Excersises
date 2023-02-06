package oop;

public class StudentDemo {

	public static void main(String[] args) {
		Student student1 = new Student("Elizabeth", "Olsen", "KI-191", 5);
		Student student2 = new Student("Tom", "Reddle", "PI-201", 4.6);
		
		Aspirant aspirant1 = new Aspirant("John", "Cena", "PI-171", 4.1, "AI: Future or Danger?");
		Aspirant aspirant2 = new Aspirant("Peter", "Parker", "PI-161", 5, "Software Engineering");
		
		Student[] studArr = new Student[4];
		studArr[0] = student1;
		studArr[1] = student2;
		studArr[2] = aspirant1;
		studArr[3] = aspirant2;
		
		for(Student student : studArr) {
			System.out.println(student.getFirstName() + " " + student.getLastName() + ": " + student.getScholarship() + " grn.");
		}
	}

}
