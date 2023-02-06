package oop;

public class Aspirant extends Student{
	private String scienceWork;
	
	public int getScholarship() {
		int scholarship;
		if(averageMark == 5) {
			scholarship = 2500;
		}
		else {
			scholarship = 2200;
		}
		
		return scholarship;
	}
	
	public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
		super(firstName, lastName, group, averageMark);
		this.scienceWork = scienceWork;
	}
	
	public String getScienceWork() {
		return scienceWork;
	}

	public void setScienceWork(String scienceWork) {
		this.scienceWork = scienceWork;
	}

}
