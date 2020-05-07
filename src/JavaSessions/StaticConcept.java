package JavaSessions;

public class StaticConcept {
	
	//class variables
	//static is only allowed for class variables
	String name;
	static int age;
	
	public void getName() {
		System.out.println("get Name ");
	}
	
	public static void getValue() {//static method will store in CMA
		System.out.println("get value");
	}
	

	public static void main(String[] args) {
	//static is not allowed for method variables	
		
		StaticConcept obj=new StaticConcept();
	//object will never hold any static variables and static methods
	//static variables and sstatic methods will store in common memory Allocation(CMA)
	//static variables can be accessed directly or by using classname.variable name	
	//static methods also can be accessed directly or classname.methodname
		obj.name="Tom";
		StaticConcept.age=23;
		System.out.println(age);//aceesing directly(because age is Static variable)
		System.out.println(StaticConcept.age);//accessing by using class name
		
		getValue();//aceesing directly(beacuse this is static method)
		StaticConcept.getValue();//accessing by using class name
		
		


		
		

	}

}
