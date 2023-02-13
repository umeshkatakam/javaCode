package javaTest;

import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] first=a.toLowerCase().toCharArray();
        char[] second =b.toLowerCase().toCharArray();
        //int count[]=new int[155];
        for(int i=0;i<a.length();i++){
            
            for(int j=i+1; j<a.length();j++){
                
                if(first[i]>first[j]){
                    char temp=first[i];
                    first[i]=first[j];
                    first[j]=temp;
               }
                if(second[i]>second[j]){
                    char temp=second[i];
                    second[i]=second[j];
                    second[j]=temp;
                    
                }
                
            }
        }
        
        
      
      
         
       System.out.println("first"+String.valueOf(first));
       System.out.println("second"+String.valueOf(second));
       String f=String.valueOf(first);
       String s=String.valueOf(second);
       
        if(f.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }

  public static void main(String[] args) {
	  
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

