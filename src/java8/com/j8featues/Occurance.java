package java8.com.j8featues;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Occurance {

	static HashMap<Character, Integer> findDuplicates(String word){
		HashMap<Character, Integer> count=new HashMap<>();
		 
		List<Character> chars=word.chars().mapToObj(n-> (char) n).collect(Collectors.toList());
		
		chars.forEach(e->{
			
			 if(count.containsKey(e)) {
				 count.put(e, (Integer)count.get(e)+1);
				
			 }
			 else {
				 count.put(e,1);
			 }
		});
		
		 
		return count;
	}
	
	public static void main(String args[]) {
		List<String> list=Arrays.asList("alsfjsjfsj","anagram","helloresfjs");
		 list.forEach(e->{
			 
			 System.out.println(Occurance.findDuplicates(e));
		 });
	//Occurance.findDuplicates("flsjfls");
		
		
	}
}
