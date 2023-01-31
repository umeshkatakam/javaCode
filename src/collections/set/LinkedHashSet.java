package collections.set;


import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set=new java.util.LinkedHashSet<>();
		
		set.add("umesh");
		set.add("surya");
		set.add("vijay");
		Iterator i= set.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
		for(String s: set) {
			
			System.out.println(s);
		}
		
	}

}
