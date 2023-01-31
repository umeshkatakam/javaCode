package collections.treeset;

import java.util.Comparator;

public class EmpComparator implements Comparator<EmpPojo>{

	@Override
	public int compare(EmpPojo o1, EmpPojo o2) {
		// TODO Auto-generated method stub
//		if(o1.getAge()> o2.getAge())
//			return 1;
//		else
//			return -1;
		return o1.getAge()-o2.getAge();
	}
	
	

}
