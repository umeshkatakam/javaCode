package test.hackerrank;

import java.util.Date;

public class SequenceSum {

	public static long sum(int i,int j,int k) {
		long sum=0;
		int loop=1;
//		for(int a=i;a<j;a++) {
//			sum=sum+a;
//			System.out.println(loop++);
//		}
//		for(int x=j;x>=k;x--) {
//			sum=sum+x;
//			System.out.println(loop++);
//		}
//		for(int a=i,b=j;a<j || b>=k;a++,b--) {
//			if(a<j) {
//				sum=sum+a;
//			}
//			if(b>=k) {
//				sum=sum+b;
//			}
//		
//			System.out.println(loop++);
//		}
//	 
//		
//		int a=i,b=j,c=k;
//		while(a<b) {
//			sum=sum+a;
//			a=a+1;
//			System.out.println(loop++);
//			
//		}
//		while(b>=c) {
//			sum=sum+b;
//			b=b-1;
//			System.out.println(loop++);
//		}
		//int a=i,b=j,c=k;
//		while(i<j) {
//			sum=sum+i;
//			i=i+1;
//			System.out.println(loop++);
//			
//		}
//		while(j>=k) {
//			sum=sum+j;
//			j=j-1;
//			System.out.println(loop++);
//		}
		for(int a=1;a<10;a++) {
			System.out.println(a);
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date();
		long start=System.nanoTime();
		System.out.println(SequenceSum.sum(0,5,-1));
		long end=System.nanoTime();
		
		Date d2=new Date();
		System.out.print("run time:"+(end-start));
		

	}

}
