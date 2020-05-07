package OOPEncapsulation;

public class User {
	
	private String name;
	private int age;
	private long phNumber;
	
	private void getUserSalary() {
		System.out.println("get user salary");
	}
	
	public void getUserSalaryInfo() {
		getUserSalary();
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

    public long getPhNumber() {
		return phNumber;
	}

    public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}



	public static void main(String[] args) {
		
		



	}

}
