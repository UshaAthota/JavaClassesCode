package JavaSessions;

public class Company {
	
	String name;
	String ceo;
	String productName;
	long revenue;
	int empcount;
	 
	//to create constructor of particular class
	 // costructor name always will be a class name
	 //can not return any value
	 //do not return any return type
	 //it looks like a function but its not a function
	//differences between function and constructor
	//we can give any name to function but constructor name always will be class name
	//function may or may not return a value but constructor can not return a value
	
	public Company() {
		System.out.println("default constructor");
	}
    public Company(int a) {
    	System.out.println("constructor with one param "+ a);
    }
    
    //create constructor with class variables
    
    public Company(String name, String ceo, String productName, long revenue, int empcount) {
		
		this.name = name;
		this.ceo = ceo;
		this.productName = productName;
		this.revenue = revenue;
		this.empcount = empcount;
	}
    
    
    
    
    public Company(String name, String ceo, String productName) {
		
    	this.name = name;
		this.ceo = ceo;
		this.productName = productName;
	}
	public static void main(String[] args) {
		
		Company c1=new Company(10);
		Company c2=new Company("Google", "Sundar pichai", "google cloud", 1000000, 10000);
		Company c3=new Company("MS", "Nadella", "MS Azure", 200000, 25000);
		Company c4=new Company("Amazon","xyz","AWS");
		
		
		System.out.println(c2.name);
		System.out.println(c2.ceo);
		System.out.println(c2.productName);
		System.out.println(c2.revenue);
		System.out.println(c2.empcount);
		
		System.out.println(c2.name+" "+c2.ceo);
		
		System.out.println(c4.name);
        
	}
	

}
