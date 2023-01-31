package java8.com.j8featues;

interface example{
	String name="umesh";
	
	default void show() {
		System.out.println("this is default method");
	}
	default void print() {
		System.out.println("this is from default print method");
	}
}
public class InterfaceEx implements example {

	
	public static void main(String args[]) {
		
		InterfaceEx ex= new InterfaceEx();
		
		System.out.println(ex.name);
		
		ex.print();
	}
}
