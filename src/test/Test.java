package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	
	 static  List<String> data=new ArrayList<>();
	 
	 
	 
	 boolean find(String name) throws CustomeException{
		
		 
		List <String> find= data.stream()
		 	.filter(p->p==name)
		 	.map(ele->ele)
		 	 .collect(Collectors.toList());
		 
			System.out.println(find);
		 
			if(find.isEmpty()) {
			
//				throw new CustomeException("not Found");
				return false;
			}
			else {
				return true;
 
			}
		 
	 }
 
	 
	 public static void main(String args[]) throws CustomeException {
		 data.add("abc");
		 data.add("pqr");
		 
		 data.add("xyz");
		 Test obj=new Test();
		 
		 boolean result= obj.find("xyz");
		 
		 
		 System.out.println((result)?"found":"not found");
		 
		  Map<Integer ,String> data=new HashMap<Integer,String>();
		  String name="abc_1, xyz_2, pqr_3";
		  String names[];
		  int id[];
		  String info[]=name.split(",");
		  System.out.println(Arrays.toString(info));
		  for(int i=0;i<info.length;i++) {
			
			   String[] temp=info[i].split("_");
			   System.out.println(temp[0]);
			   data.put(Integer.parseInt(temp[1]),temp[0]);
		  }
		  
		  	  
		  	System.out.println(data);
		  
		  
		  
		  
		  
		  
		  
		  
		  
	 }
	
	
	
	
	
	
}
