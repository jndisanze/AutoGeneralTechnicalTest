package au.autogeneral.api.model;

public class Completed {

	public static boolean isCompleted(String text) {
	
		return text.length()>=1 && text.length()<=50 ? true : false;
	}
}
