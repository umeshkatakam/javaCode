package javaTest;

public class Simple {

	public static void main(String[] args) {
		
		String word="geeksofgeeks";
		int[] ch=new int[256];
	 
		for(int i=0;i<word.length();i++) {
			
			
			ch[word.charAt(i)]++;
			 
		}
		
		 
		
		
		
		for(int i=0;i<ch.length-1;i++) {
			
			//System.out.println(ch[word.charAt(i)]);
		}
		 
		for(int i=0;i<word.length();i++) {
			int count=0;
			
			 for (int j = 1; j <= i; j++) {
	               
	                // If any matches foundyste
	                if (word.charAt(i) == word.charAt(j))
	               
	                    count++;
	            }
			
		 
			if(count==1) {
				
				System.out.println("count of "+word.charAt(i)+"is"+ch[word.charAt(i)]);
			}
			 
		}
 
		char ar[]= {'c','h','a','r'};
		String str="";
		for(char i : ar) {
			str+=i;
		}
		//System.out.println(str);
	}
}
