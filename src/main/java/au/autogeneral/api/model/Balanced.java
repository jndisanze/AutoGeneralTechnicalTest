package au.autogeneral.api.model;

import java.util.Stack;

public class Balanced {
	
	public static boolean isBalancedEfficient(String strInput) {
		    if(strInput == null || strInput.length()==0)  return false;
	        Stack<Character> utilities=new Stack<Character>();
	        for(char c:strInput.toCharArray()){
	            if(c=='(')
	            	utilities.push(')');
	            else if(c=='{')
	            	utilities.push('}');
	               else if(c=='[')
	            	   utilities.push(']');
	               else if(utilities.isEmpty()||utilities.pop()!=c)
	               return false;
	        }
	               return utilities.isEmpty();
	    
	}
	

}
