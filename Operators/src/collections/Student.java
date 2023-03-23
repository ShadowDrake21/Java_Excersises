package collections;

import java.util.Arrays;
import java.util.List;

public class Student {
	private String name;
	private String group;
	private int course;
	private int[] markArr;
	
	public Student(String name, String group, int course, int[] markArr) {
		this.name = name;
		this.group = group;
		this.course = course;
		this.markArr = markArr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int[] getMarkArr() {
		return markArr;
	}

	public void setMarkArr(int[] markArr) {
		this.markArr = markArr;
	}
	
	public float averageMarks() {
		int sumOfMarks = 0;
		
		for(int mark : getMarkArr()) {
			sumOfMarks += mark;
		}
		return sumOfMarks/getMarkArr().length;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", group=" + group + ", course=" + course + ", markArr="
				+ Arrays.toString(markArr) + ", average = " + averageMarks() + "]";
	}
	
	
}
