package test.hackerrank;

 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'mostActive' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY customers as parameter.
     */

    public static List<String> mostActive(List<String> customers) {
    // Write your code here
    int total=customers.size();
    List<String> traders=new ArrayList<String>();
    List<Integer> count=new ArrayList<>();
    List<Double> percentage=new ArrayList<>();
    
    //customers.forEach(( e)->{
      for(String e: customers) { 
        if(traders.contains(e)){
            int index=traders.indexOf(e);
            count.set(index, count.get(index)+1);
        }else{
            traders.add(e);
            count.add(1);
        }
    }
   // });
    
    for(int i=0;i<traders.size();i++){
        double d=(count.get(i)/total)*100;
        percentage.add(d);
       // percentage.set(i, (count.get(i)/total)*100));
        if(percentage.get(i)>=5){
            List<String> res=new ArrayList<>();
            res.add(traders.get(i));
       res.sort((String a,String b)-> a.compareTo(b));
      res.forEach(e->System.out.print(e));
            
        }
    }
    
     
    return traders;
    

    }

}
public class arrayManipulation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int customersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> customers = new ArrayList<>();

        for (int i = 0; i < customersCount; i++) {
            String customersItem = bufferedReader.readLine();
            customers.add(customersItem);
        }

        List<String> result = Result.mostActive(customers);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
