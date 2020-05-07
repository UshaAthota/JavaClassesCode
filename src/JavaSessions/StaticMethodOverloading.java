package JavaSessions;

public class StaticMethodOverloading {
	
	//we can over load static methods also
	
	public static void getName() {
		
	}
    public static void getName(int a) {
		
	}
    public static void getName(String name) {
		
   	}


	public static void main(String[] args) {
	//we can overload main method also
		System.out.println("main method");
		
		StaticMethodOverloading.main(10);
		StaticMethodOverloading.main(12, 10);
	}
		
	public static void main(int a) {
		System.out.println("main method "+ a);
		
    }
	public static void main(int a,int b) {
		System.out.println("main method "+ a + b);
		
    }

}
