package test.hackerrank;

public class UtopianTree {

	public static int findHeight(int n) {
		
		int res=(int) Math.pow(2, n+1)-1;
		
		return res/2;
	}
	
	public static void main(String[] args) {
		
		int n=3;
		System.out.println(UtopianTree.findHeight(n));
		
	}
}
