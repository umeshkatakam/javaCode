package javaTest;
import java.time.LocalDate; // import the LocalDate class
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class first {

	public static void main(String[] args) {
		 
		LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	    LocalDate l=LocalDate.of(1999,01,29);
	    System.out.println("day"+l.getDayOfWeek());
	    
	    Date d=new Date();

	     System.out.println("date"+d);
	     
	     SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	      System.out.println("sdf"+sdf.format(new Date()));
	      
		      Calendar cal=Calendar.getInstance();
		      cal.set(2020,10, 11);  //January 30th 2000
		      int sDate = cal.DATE;
		      System.out.println("calender week"+sDate);
		       
		      System.out.println("calender week"+cal.get(Calendar.DAY_OF_WEEK));
		      
		     
			    LocalDate lo=LocalDate.of(2021,10,11);
			    System.out.println("day"+lo.getDayOfWeek());
		      
	}

}
