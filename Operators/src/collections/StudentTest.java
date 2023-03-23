package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>(); 
		
		studentList.add(new Student("������� �.�.", "��-181", 4, new int[]{98, 89, 100, 100, 96, 91}));
		studentList.add(new Student("������� �.�.", "��-192", 3, new int[]{60, 60, 70, 74, 67, 70}));
		studentList.add(new Student("�������� �.�.", "��-232", 1, new int[]{95, 93, 100, 100, 100, 90}));
		studentList.add(new Student("������� �.�.", "��-191", 3, new int[]{80, 89, 80, 100, 90, 91}));
		studentList.add(new Student("������� �.�.", "��-211", 2, new int[]{70, 80, 71, 67, 67, 70}));
		
		System.out.println("����������� ������:");
		printList(studentList);
		System.out.println();
		
		System.out.println("����� ��������:");
		deleteLessThree(studentList);
		printList(studentList);
		System.out.println();
		
		System.out.println("������ ������������ ���������:");
		transferToTheNextCourse(studentList);
		System.out.println();
		
		System.out.println("������ ��������� � ������� �����:");
		printStudents(studentList, 2);
		System.out.println();

	}
	
	public static void printList(List<Student> studentList) {
		Iterator<Student> iterator = studentList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

	public static void deleteLessThree(List<Student> studentList) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).averageMarks() < 75) {
				studentList.remove(i);
			}
		}
	}
	
	public static void transferToTheNextCourse(List<Student> studentList) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).averageMarks() >= 75) {
				Student student = studentList.get(i);
				int course = student.getCourse() + 1;
				student.setCourse(course);
				
				System.out.println("������� " + student.getName() + " � ������ " + student.getGroup() + ", ������� ����� ������� ��� �� ���� ��������� " 
				+ student.averageMarks() + " ��������� �� " + student.getCourse() + " ����.");
			}
		}
	}
	
	public static void printStudents(List<Student> studentList, int course) {
		Iterator<Student> iterator = studentList.listIterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getCourse() == course) {
				System.out.println("������� " + student.getName() + ", " + student.getGroup() + ", ���� " + student.getCourse());
			}
		}
	}
}
