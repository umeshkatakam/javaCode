package demo;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i, j, row=6;   
		//outer loop for rows  
		for(i=0; i<row; i++)   
		{   
		//inner loop for columns  
		for(j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}  
	}

}
