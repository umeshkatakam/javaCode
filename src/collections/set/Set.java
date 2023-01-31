package collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
	
 
	public static void main(String args[]) {
		
		
		java.util.Set <Integer> s1=new HashSet<>();
		
		s1.add(1);
		s1.add(10);
		s1.add(34);
		
		Iterator i =s1.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
		System.out.println(s1.remove(1));
		
		
		
	}
	
}
