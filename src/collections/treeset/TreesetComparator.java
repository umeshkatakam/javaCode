package collections.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetComparator {
	
public static void main(String args[]) {
		
		Set<EmpPojo> ts=new TreeSet<EmpPojo>(new EmpComparator());
		ts.add(new EmpPojo(11, "umesh", 54));
		ts.add(new EmpPojo(2, "surya", 44));
		ts.add(new EmpPojo(3, "vijay", 41));
		
		Iterator<EmpPojo> i=ts.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		System.out.println("=========================");
		
		
		TreeSet<EmpPojo> ts1=new TreeSet<EmpPojo>((EmpPojo e1,EmpPojo e2)->
			e2.getName().compareTo(e1.getName()));
			
		ts1.add(new EmpPojo(111, "umesh", 54));
		ts1.add(new EmpPojo(102, "surya", 39));
		ts1.add(new EmpPojo(101, "vijay", 41));
		 ts1.forEach((e)->{
			 System.out.println(e);
		 });
	
	}
}
