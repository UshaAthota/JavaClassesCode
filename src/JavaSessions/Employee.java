package JavaSessions;

public class Employee {
	
 //A class is nothing but blue print of particular object
 // object is nothing but physical entity of any element
 //these variables are called class variables
	
	String name;
	int age;
	String role;
	int empid;
	boolean isPerminent;

	public static void main(String[] args) {
		
	Employee e1=new Employee();//1st object
	e1.name="Abhi";
	e1.age=2;
	e1.role="QA";
	e1.empid=101;
	e1.isPerminent=true;
	
	Employee e2=new Employee();//2nd object
	e2.name="Karthi";
	e2.age=3;
	e2.role="Developer";
	e2.empid=102;
	e2.isPerminent=false;
	
	System.out.println(e1.name+" "+e1.age+" "+e1.role+" "+e1.empid+" "+e1.isPerminent);
	System.out.println(e2.name+" "+e2.age+" "+e2.role+" "+e2.empid+" "+e2.isPerminent);
	
	
	Employee e3=new Employee();//3rd object
	e3.name="Suhas";
	e3.age=4;
	e3.isPerminent=true;
	
	System.out.println(e3.name);
	System.out.println(e3.role);//it will take default value null because we did not give any value
	System.out.println(e3.empid);//defalult value 0
	System.out.println(e3.age);
	System.out.println(e3.isPerminent);
//e1,e2,e3 are called reference variables (we can give any name)
		
//create object without reference variable
	
	new Employee();//4th object
	
	//call or acess the methods of loginpage class(means to acess methods from differnt class)
	     
	   LoginPage lp=new LoginPage();
	   lp.login();
	   lp.login(9876);
	   
	// to call the constructor which is available in another class
	   
	
	   Company comp=new Company("Apple","Steve","abc");
	   System.out.println(comp.name); 
	

	
	
	
	
	
	
		


		
		
		

	}

}
