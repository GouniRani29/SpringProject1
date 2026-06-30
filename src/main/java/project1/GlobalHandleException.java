package project1;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandleException {
	@ExceptionHandler(ResourceNotFoundException.class)
	public String handleResourceNotFound(ResourceNotFoundException ex) {
		return ex.getMessage();
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public String handleValidation(MethodArgumentNotValidException ex) {
		return ex.getBindingResult().getFieldError().getDefaultMessage();
	}
}
