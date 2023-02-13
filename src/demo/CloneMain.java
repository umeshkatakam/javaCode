package demo;

public class CloneMain {

	
	
	
public static void main(String args[]) throws CloneNotSupportedException {
		
	Clone c1=new Clone("umesh");
	
	
	System.out.println(c1.name);
	
	Clone c2=(Clone) c1.clone();
	
	System.out.println(c2.name);
	c2.name="surya";
	System.out.println(c1.name);
	System.out.println(c2.name);
	
	}
}
