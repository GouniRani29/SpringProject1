package project1;

import java.util.List;

public interface StudentService {
	//method1
	Student saveStudent(Student student);
	
	//method2
	List<Student>getAllStudents();
	
	//method3
	Student getStudentById(Long id);
	
	//method4
	Student updateStudent(Long id,Student student);
	
	//method 5
	void removeStudent(Long id);
}
