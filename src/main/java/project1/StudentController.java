package project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService service;
	@GetMapping("/students")
	public List<Student> getAllEmployees() {
        return service.getAllStudents();
	}
	@PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }
	 @GetMapping("/{id}")
	    public Student getStudentbyId(@PathVariable Long id) {
	        return service.getStudentById(id);
	 }
	// Update student
	 @PutMapping("/{id}")
	 public Student updateStudent(@PathVariable Long id,
	                              @RequestBody Student student) {
	     return service.updateStudent(id, student);
	 }
	 @DeleteMapping("/delete/{id}")
		public String removeStudent(@PathVariable long id) {
		 service.removeStudent(id);
			return "Deleted EMP";
		}
	}

