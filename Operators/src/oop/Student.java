package oop;

public class Student {
	private String firstName;
	private String lastName;
	private String group;
	protected double averageMark;

	public int getScholarship() {
		int scholarship;
		if(averageMark == 5) {
			scholarship = 2000;
		}
		else {
			scholarship = 1900;
		}
		
		return scholarship;
	}
	
	public Student(String firstName, String lastName, String group, double averageMark) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
		this.averageMark = averageMark;
	}

	public Student() { }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
}
