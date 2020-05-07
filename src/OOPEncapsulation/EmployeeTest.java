package OOPEncapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

     Employee emp=new Employee();//the object is created with another class(Employee)
      emp.name="Steve";
      emp.getCity();
      
      emp.setAge(20);
      System.out.println(emp.getAge());
		

	}

}
