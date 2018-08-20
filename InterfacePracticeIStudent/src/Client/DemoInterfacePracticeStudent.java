package Client;

import Model.Professor;
import Model.Student;
import Model.University;

//import Student;
public class DemoInterfacePracticeStudent {
	public static void main(String[] args) {
		Student student1 = new Student("name1","reg2");
		Student student2 = new Student("name2","reg3");
		Student student3 = new Student("name3","reg4");
		Student student4 = new Student("name4","reg5");
		
		Professor prof1 = new Professor("pname1");
		Professor prof2 = new Professor("pname2");
		Professor prof3 = new Professor("pname3");
		
		University university = new University();
		university.addProfessor(prof1);
		university.addProfessor(prof2);
		university.addProfessor(prof3);
		
		university.addStudent(student1);
		university.addStudent(student2);
		university.addStudent(student3);
		university.addStudent(student4);
		
		university.listAllProfessors();
		university.listAllStudents();
	}
}
