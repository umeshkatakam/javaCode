package collections.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

 

public class TreesetComparable { 

	
	public static void main(String args[]) {
		
		Set<EmpPojo> ts=new TreeSet<>();
		ts.add(new EmpPojo(11, "umesh", 24));
		ts.add(new EmpPojo(2, "surya", 44));
		ts.add(new EmpPojo(3, "vijay", 45));
		
		Iterator<EmpPojo> i=ts.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		System.out.println("****************");
		for(EmpPojo e:ts) {
			System.out.println(e);
		}
		System.out.println("==============");
		ts.forEach((EmpPojo e)->{
			System.out.println(e);
		});
	}
	
	 
}
