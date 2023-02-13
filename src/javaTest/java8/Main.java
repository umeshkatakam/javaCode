package javaTest.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@FunctionalInterface
interface PrintNumbers{
	String name="umesh";
	public void print( int n);
}


public class Main {

	 
	
	public static void main(String []args) {
	
	List<Model>  list =new ArrayList<Model>();
	
	list.add(new Model(11L,"umesh",24));
	list.add(new Model(1L,"surya",12));
	list.add(new Model(6L,"ajay",4));
	
	System.out.println(list);
	//Comparator sortByAge=(Model l1,Model l2)->l1.getAge().compareTo(l2.getAge());
	list.sort((Model m1, Model m2)-> m1.getAge()-m2.getAge());
	System.out.println(list);
	
	//by Name
	list.sort((Model m1,Model m2)-> m1.getName().compareTo(m2.getName()));
	System.out.println(list);
//	list.sort(();
		
	
	//forEach
	
	list.forEach(m->{
		System.out.println(m);
	}
	);
	
	
//	IntStream.range(0, 10).
//	filter(i->((i+1)%100 ==0))
//	.forEach(i->{
//		
//		
//	}
//			));
//	
	
		    IntStream.range(1, 10).forEach((i)->{
		    	System.out.println("numbersss"+i);
		    });
//	
		    
		    PrintNumbers p=n -> {
		    	while(n<10) {
		    		System.out.println("number"+n++);
		    	}
		    };
		     
		    p.print(1);
		 
		    System.out.println(p.name);
		    
		    //stream
		    
		    String name=new String("abc");
		    String name2="abc";
		    
		    if(name==name2) {
		    	System.out.println("true");
		    }else {
		    	System.out.println("false");
		    }
		    
		    if(name.equals(name2)) {
		    	System.out.println("true");
		    }else {
		    	
		    	System.out.println("false");
		    }
		    System.out.println();
		    
		    
		    
		    try {
		    	  int n=10/0;
		    	  System.out.println("in try...");
		    	
		    }
		    catch(ArithmeticException e) {
		    	System.out.println("b");
		    }
		    
		    catch(Exception e) {
		    	System.out.println("e");
		    }
		   
		    
		    String s1 = "HELLO";
	       
	        String s3 =  new String("HELLO");
	        String s2 = "HELLO";
	        System.out.println(s1 == s2); // true
	        System.out.println(s1 == s3); // false
	        System.out.println(s1.equals(s2)); // true
	        System.out.println(s1.equals(s3)); // true
		    
		     String names="umeshkatakam";
		     System.out.println(names.substring(1,6));
		    
		    
		    
	}
}
