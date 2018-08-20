package Model;
import java.util.ArrayList;

public class University {
	ArrayList<IPerson> students=new ArrayList<IPerson>();
	ArrayList<IPerson> professors=new ArrayList<IPerson>();
	
	public void addStudent(Student student){
		students.add(student);
	}
	
	public void addProfessor(Professor professor){
		professors.add(professor);
	}
	
	public void listAllStudents() {
		for(IPerson student : students) {
			System.out.println("Student name is : "+((Student)student).getName()+
					" Registration number : "+ ((Student)student).getRegNo());
		}
	}
	
	public void listAllProfessors() {
		for(IPerson professor : professors) {
			System.out.println("Professor name is : "+((Professor)professor).getName());
		}
	}
}
