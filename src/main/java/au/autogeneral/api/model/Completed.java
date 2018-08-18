package au.autogeneral.api.model;

public class Completed {

	public static boolean isCompleted(String strInput) {
		return strInput != null && strInput.length()>=1 && strInput.length()<=50 ? true : false;
	}
}
