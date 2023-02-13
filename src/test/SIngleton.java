package test;

public class SIngleton {

	private static SIngleton obj; 
	
	public static SIngleton getInstance() {
		
		try {
			synchronized (obj) {
				
				if(obj==null) {
					return new SIngleton();
				}
				else {
					return obj;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	 
}
