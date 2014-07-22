package Data_Access_Object_Pattern;

public class DaoPatternDemo {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [Roll No : " + student.getRollNo()
					+ " Name : " + student.getName() + "]");
		}
		
		//Add Student
		Student student = new Student("Mark",4);
		studentDao.addStudent(student);
		
		//Update Student
		studentDao.getAllStudents().get(student.getRollNo());
		student.setName("Ouchi");
		studentDao.updateStudent(student);
		
		for (Student student1 : studentDao.getAllStudents()) {
			System.out.println("Student: [Roll No : " + student1.getRollNo()
					+ " Name : " + student1.getName() + "]");
		}
		

	}

}
