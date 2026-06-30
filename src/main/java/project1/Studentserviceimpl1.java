package project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class Studentserviceimpl1 implements StudentService {
	@Autowired
	private StudentRepository repository;
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student not found"));
	}
	
	public Student updateStudent(Long id, Student student) {

        Student s = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        s.setName(student.getName());
        s.setEmail(student.getEmail());

        return repository.save(s);
    }
		 public void removeStudent(Long id) {

		        Student s = repository.findById(id)
		                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

		        repository.delete(s);
		    }
		}

