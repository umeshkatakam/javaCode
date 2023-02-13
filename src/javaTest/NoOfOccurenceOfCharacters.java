package javaTest;

import java.util.Arrays;

public class NoOfOccurenceOfCharacters {
    static final int MAX_CHAR = 256;
 
    static void getOccuringChar(String str)
    {
         
        // Create an array of size 256
        // i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];
 
//        int len = str.length();
 
        // Initialize count array index
        for (int i = 0; i < str.length(); i++){
                
            count[str.charAt(i)]=count[str.charAt(i)]+1;
         //   System.out.println("count value of "+str.charAt(i)+"is"+count[str.charAt(i)]+"at pos"+count[i]+i);
            
        }
        
        for(int a=0;a<str.length();a++) {
        	System.out.println("*********** "+count[str.charAt(a)]);
        	System.out.println(str.charAt(a));
        	
        }
        // Create an array of given String size
//        char ch[] = new char[str.length()];
        char[] ch=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(i);
            int find = 0;
          
            for (int j = 0; j <= i; j++) {
               
                // If any matches foundyste
                if (str.charAt(i) == ch[j])
               
                    find++;
            }
 
            if (find == 1) {
            	System.out.println(
                        "Number of Occurrence of "
                        + str.charAt(i)
                        + " is:" + count[str.charAt(i)]+"pos"+i);
            }
                
//                System.out.println(
//                    "Number of Occurrence of "
//                    + str.charAt(i)
//                    + " is:" + count[str.charAt(i)]);
        }
    }
   
    // Driver Code
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        getOccuringChar(str);
    }
}
