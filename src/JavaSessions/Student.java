package JavaSessions;

public class Student {
	String name;
	int age;
	int id;
	

	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}


	public static void main(String[] args) {
		
		Student s1=new Student("Abhi",2,100);
		Student s2=new Student("Karthi",3,200);
		Student s3=new Student("Suhas",4,300);
		
		System.out.println(s1.name+" "+s1.age+" "+s1.id);
		System.out.println(s2.name+" "+s2.age+" "+s2.id);
		System.out.println(s3.name+" "+s3.age+" "+s3.id);
		
		s1=s2;
		
		System.out.println(s1.name+" "+s1.age+" "+s1.id);
		System.out.println(s2.name+" "+s2.age+" "+s2.id);
		System.out.println(s3.name+" "+s3.age+" "+s3.id);
		
		s2=s3;
		
		System.out.println(s1.name+" "+s1.age+" "+s1.id);
		System.out.println(s2.name+" "+s2.age+" "+s2.id);
		System.out.println(s3.name+" "+s3.age+" "+s3.id);
		
		s3=s1;
		
		System.out.println(s1.name+" "+s1.age+" "+s1.id);
		System.out.println(s2.name+" "+s2.age+" "+s2.id);
		System.out.println(s3.name+" "+s3.age+" "+s3.id);
		
	
	
	
	}

}
