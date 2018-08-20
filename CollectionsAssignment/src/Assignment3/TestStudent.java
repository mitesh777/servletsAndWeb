package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		StudentAdmin sa = new StudentAdmin();
		sa.createStudent(students);
		sa.sortStudents(students);
		System.out.println(students);
	}
}
