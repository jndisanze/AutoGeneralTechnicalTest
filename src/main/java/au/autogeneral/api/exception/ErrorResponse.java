package au.autogeneral.api.exception;

import java.util.ArrayList;

public class ErrorResponse {
	
	private int errorCode;
	private String name;
	private ArrayList < ErrorDetails > details = new ArrayList <ErrorDetails> ();

	public ErrorResponse(int errorCode,String name,ErrorDetails errorDetails) {
		   this.errorCode = errorCode;
		   this.name = name;
		   this.setErrorDetails(errorDetails);
	}
	public ErrorResponse() {
		
	}
	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return name;
	}

	public void setMessage(String name) {
		this.name = name;
	}


	public ArrayList < ErrorDetails > getDetails() {
		return details;
	}
	public void setDetails(ArrayList < ErrorDetails > details) {
		this.details = details;
	}
	public void setErrorDetails(ErrorDetails errorDetails) {
		this.details.add(errorDetails);
	}
}