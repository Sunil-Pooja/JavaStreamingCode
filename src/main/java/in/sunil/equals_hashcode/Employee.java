package in.sunil.equals_hashcode;

public class Employee {
	
	private String name;
	private int age;

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
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	
	/*
	 * @Override public boolean equals(Object obj) {
	 * 
	 * if(this==obj) return true; if(!(obj instanceof Employee)) return false;
	 * Employee employee=(Employee)obj; return employee.getAge()==this.getAge() &&
	 * employee.getName()==this.getName(); }
	 * 
	 */
	
	  @Override public int hashCode() { int result=17; result=31*result+age;
	  result=31*result+(name!=null ? name.hashCode():0); return result; }
	 
	 
}
