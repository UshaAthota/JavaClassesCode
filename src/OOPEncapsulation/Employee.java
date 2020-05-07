package OOPEncapsulation;

public class Employee {
	
//the private variables and private methods can be accessed only with in the class
	
	public String name;
	private int age;
	
	public void getCity() {
		System.out.println("get city");
	}
	private void getCountry() {
		System.out.println("get country");
	}
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}






	
	

	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="Tom";
		e.age=25;
		System.out.println(e.name);
		System.out.println(e.age);
		e.getCity();
		e.getCountry();



	}

}
