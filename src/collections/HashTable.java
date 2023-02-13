package collections;

import java. util.HashMap;
import java. util.Hashtable;
import java. util.Map;
import java.util.Map.Entry;

public class HashTable {
	
	
	public static void main (String args[]) {
		
		
		Hashtable<Integer, String> table=new Hashtable<>();
		
		table.put(1, "umesh");
		table.put(2, "surya");
		for(Map.Entry m:table.entrySet()) {
			//System.out.println(m.getKey()+ ""+m.getValue());
			
		}
		table.forEach((k,v)->{
			//System.out.println(k +' '+v);
		});
		for(Entry<Integer, String> i :table.entrySet()) {
			System.out.println(i);
		}
	HashMap<Integer, String> map=new HashMap<>();
	map.put(101,"hyderabad");
	map.put(102,"bangalore");
	
	System.out.println(map.get(101));
	String word="all is well how are you:::!";
	 HashMap<Character, Integer>	count=new HashMap<>();
	 
	 for(int i=0;i<word.length();i++)
	 {
		 if(count.containsKey(word.charAt(i))) {
			 
			 
			 Integer temp=count.get(word.charAt(i))+1;
			 count.put(word.charAt(i), count.get(word.charAt(i))+1);
		 }
			 else
			 {
				 count.put(word.charAt(i), 1);
			 }
		 }
	 
	 count.forEach((k,v)->{
		 System.out.println(k+"="+v);
	 });
	 
	 }
	 
	}
	
	
	


