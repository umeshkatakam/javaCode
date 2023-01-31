package java8.com.j8featues;

import java.util.function.Predicate;

public class PredicateInterfaceEx {

	static boolean checkAge(int age)
	{
		if(age>17) {
			return true;
		}
		else 
			return false;
	}
	
	Predicate<Integer> check=x-> (x>17);
		static boolean PredicateWithFunction(int num,Predicate<Integer> predicate)
			{
				if(predicate.test(num))
					return true;
				else
					return false;
			}
	
	public static void main(String args[]) {
		
		Predicate<Integer> predicate=PredicateInterfaceEx::checkAge;
		System.out.println(predicate.test(12));
		Predicate<Integer> greaterThanten=x->(x>10);
		Predicate<Integer> lowerThanTwenty=x->(x<20);
		
		boolean numberCheck=greaterThanten.or(lowerThanTwenty).test(5);
		System.out.println(numberCheck);
		
		System.out.println(PredicateWithFunction(10, (i)->i<9));
		
	 
	}
}
