package java8.com.j8featues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import java8.com.model.Employee;

interface drawable
{
	String show(String s);
}
public class Lamda {
public static void main(String args[]) {
	//without lamda exp
	drawable d= new drawable() {
		
		@Override
		public String show(String s) {
			// TODO Auto-generated method stub
			return s;
		}
	};
	System.out.println(d.show("umesh"));
	
	
	// with lamda exp
	drawable d2=(s)->(s);
	System.out.println(d2.show("umesh"));
	
	
	//with for each
	 List<String> list=new ArrayList<String>();  
	 list.add("jai"); 
     list.add("ankit");  
     list.add("mayank");  
     list.add("irfan");  
     
	
     list.forEach(e->{
    	 System.out.println(e);
     });
     System.out.println("============");
     Collections.sort(list,(e1,e2)->
     {
    	 return e1.compareTo(e2);
     });
	System.out.println(list);
	
	
	List<Employee> emps=new ArrayList<Employee>();
	emps.add(new Employee(33, "umesh", "devloper", 60000));
	emps.add(new Employee(101, "surya", "support", 7000));
	emps.add(new Employee(202, "vijay", "owner", 2000000));
	emps.add(new Employee(23, "kajal", "devloper", 20000));
	emps.add(new Employee(63, "arjun", "motivater", 7000));
	emps.add(new Employee(33, "ajith", "manager", 65000));
	
	Collections.sort(emps,(e1,e2)->{
		return (int) (e2.getSalary()-e1.getSalary());
	});
	 
	List<Employee> e= emps.stream().filter(p->p.getSalary()>50000).collect(Collectors.toList());
							
			;
	
		
	Iterator i= e.iterator();
	
	while(i.hasNext())
			{
		System.out.println(i.next());
			}
	
	
	
	
	List<Integer> nums=Arrays.asList(1,22,3,4,55,6,2);
	
	Integer odd=nums.stream().filter(x -> x%2!=0).reduce(0,(e1,e2)-> e1+e2);
	System.out.println("odd num"+odd);
	
	
	Optional<Integer> highest=nums.stream().sorted((x,y)->x-y).skip(1).findFirst();
	System.out.println(highest.get());
		
	
	
	List<Employee> startwitha=emps.stream().filter((Employee x)->{
		return x.getName().startsWith("a");
	}).toList();
	
	System.out.println(startwitha);
	
	
	
	
	
	
	
}
}
