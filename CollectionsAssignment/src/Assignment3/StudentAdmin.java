package Assignment3;

import java.util.Collections;
import java.util.List;

public class StudentAdmin {

	public void sortStudents(List<Student> students) {
		Collections.sort(students);
	}
	
	public void createStudent(List<Student> students) {
		Student student1 = new Student(1001,"name1",80);
		Student student2 = new Student(1000,"name2",80);
		Student student3 = new Student(1002,"name3",80);
		Student student4 = new Student(999,"name5",80);
		Student student5 = new Student(995,"name4",80);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
	}
}
