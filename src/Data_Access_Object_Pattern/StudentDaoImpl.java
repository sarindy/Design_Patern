package Data_Access_Object_Pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	// List is work as database
	List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("Sarindy", 0);
		Student student2 = new Student("Channa", 1);
		Student student3 = new Student("Wathiyutt", 2);
		Student student4 = new Student("Vattanac", 3);

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

	}

	public List<Student> getAllStudents() {

		return students;
	}

	public Student getStudent(int rollNo) {

		return students.get(rollNo);
	}

	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo()
				+ " ,updated in the database");

	}

	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("Student : Name " + student.getName() + "Roll No "
				+ student.getRollNo() + "  removed!");

	}

	public void addStudent(Student student) {
		students.add(student);
		System.out.println("New Student Named " + student.getName()
				+ " Roll No " + student.getRollNo() + " Added!");

	}

}
