package demo;

public class Clone implements Cloneable{
	
	String name;
	
	
	
	public Clone(String name) {
		super();
		this.name = name;
	}



	protected Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}
	

	
}
