package test;

public class SumofNumber {

	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="give me 10 dollars 3.8";
		 String word[]=sentence.split(" ");
         int strCount=0;
         int intCount=0;
         int doubleCount=0;
         
         for(String s : word){
        	 try {
        		 int j=Integer.parseInt(s);
//        		 System.out.println(j);
        		 intCount+=1;
        		 
        		 
        	 }
        	 catch(Exception e){
        		 try {
        			 Double d=Double.parseDouble(s);
//        			 System.out.println(d);
        			 doubleCount+=1;
        		 }
        		 catch(Exception e2) {
//        			 System.out.println(e2);
        			 strCount+=1;
        		 }
        		 
        		 
        		 
        	 }
            
             
         }
         System.out.println("string "+strCount);
         System.out.println("integer "+intCount);
         System.out.println("double "+doubleCount);
//         System.out.println((3.00%3==0)?"true":"false");
 
	}

}
