package collections.treeset;

//public class EmpPojo implements Comparable<EmpPojo>{
public class EmpPojo{
	
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public EmpPojo(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmpPojo [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
//	  @Override public int compareTo(EmpPojo o) { // TODO Auto-generated method
//	   if(id > o.id) return 1; else return -1;
//	   
//	  }
	 
	
}
