package test;

public class Print {

	public static void main(String args[]) {
		
		
		String word="all is well how are you;";
		 
		int check[]=new int[256];
		for(int i=0;i<word.length();i++) {
			check[word.charAt(i)]++;
			System.out.println(check[word.charAt(i)]);
		}
		
		char ch[]=word.toCharArray();
		
		
		for(int j=0;j<word.length();j++) {
			int status =0;
			for(int k=0;k<=j;k++)
			{
				if(word.charAt(k)==ch[j]) {
					status++;
				}
					
			}
				
		
		if(status==1) {
		System.out.println(word.charAt(j)+"  "+check[word.charAt(j)]);	
		}
	}
	}
	
	
}