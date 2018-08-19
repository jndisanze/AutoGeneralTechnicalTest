package au.autogeneral.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class APIExceptionHandler {
	
	@ExceptionHandler(TodoException.class)
	public ResponseEntity<ErrorResponse> exceptionToDoHandler(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.BAD_REQUEST.value());
		error.setName(ex.getMessage());
		ErrorDetails details = new ErrorDetails();
		details.setLocation("params");
		details.setMsg("Must be between 1 and 50 chars long");
		details.setValue("");
		details.setParam("text");
		error.setErrorDetails(details);
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(TaskException.class)
	public ResponseEntity<ErrorResponse> exceptionTaskHandler(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.BAD_REQUEST.value());
		error.setName(ex.getMessage());
		ErrorDetails details = new ErrorDetails();
		details.setLocation("params");
		details.setMsg("This request is not yet implemented");
		details.setValue("");
		details.setParam("text");
		error.setErrorDetails(details);
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.NOT_FOUND.value());
		error.setName(ex.getMessage());
		ErrorDetails details = new ErrorDetails();
		details.setLocation("params");
		details.setMsg("The request could not be understood by the server.");
		details.setValue("");
		details.setParam("text");
		error.setErrorDetails(details);
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.NOT_FOUND);
	}

}