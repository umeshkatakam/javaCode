package demo;

public class InstanceTypes {
	String name="umesh";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class cls = Class.forName("InstanceTypes");
			  InstanceTypes obj
              = (InstanceTypes)cls.newInstance();

          System.out.println("name"+obj.name);
		}
		catch(ClassNotFoundException e) {
			
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
