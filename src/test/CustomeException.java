package test;

public class CustomeException extends Exception{
	
	public CustomeException(){}
	
	public CustomeException(String message) {
		// TODO Auto-generated constructor stub
		
		System.out.println("error"+message);
	}

}
