package au.autogeneral.api.exception;

public class TaskException extends Exception {
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public TaskException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public TaskException() {
		super();
	}
}
