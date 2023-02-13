package test;

public class PrintRepeatChar {

	
	
	public static void main(String args[]) {
		
		
		String name="GeekfoGeeks";
		int check[]=new int[256];
		
		for(int i=0;i<name.length();i++) {
			
			check[name.charAt(i)]++;
		}
		
		char ch[]=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			int status =0;
			for(int k=0;k<=i;k++) {
				
				if(name.charAt(i)==ch[k]) {
					status++;
				}
			}
			if(status==1) {
				System.out.println("repeated char"+name.charAt(i)+"is"+check[name.charAt(i)]);
			}
		}
		
	}
}
