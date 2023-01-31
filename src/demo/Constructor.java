package demo;

import java.io.IOError;
import java.io.IOException;

class Parent{
	
	String add() {
		return "add";
	}
	
}


public class Constructor extends Parent{

	 String name="umesh";
	 
	 static String Show() {
		 Constructor obj =new Constructor();
		 System.out.println(obj.name);
		 return "show";
	 }
	 

	 String add() {
		System.out.println("done");
		 return "done";
	 }
	public Constructor(){
		 
		
		
	}
	private Constructor(int a ) {
		 
		System.out.println(a);
	}
	
	public static void main(String args[]) throws Exception {
		 
		Constructor con=new Constructor(10);
		con.add();
		Constructor.Show();
	}
}
