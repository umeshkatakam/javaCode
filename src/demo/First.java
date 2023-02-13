package demo;

import java.util.List;

public class First {

	
	
	public static void main(String args[] ) {
		
		System.out.println(10+20+"hello world");//30hello world
		System.out.println("hello world"+10+20);//helloworld1020
		System.out.println(10*20+"hello world");//200hellowrld
		System.out.println("hello world"+10*20);//helloworld200
		
		int n1=0;
		int n2=1;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0;i<10;i++) {
		 	
			int sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
			
		}
		
	 
		
	}
}
