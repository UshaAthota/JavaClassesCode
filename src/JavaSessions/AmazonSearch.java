package JavaSessions;

public class AmazonSearch {

	//duplicate methods are not allowed
	//Method over Loading is always possible with in the class
	//Method Over Loading-when same method name with different parameters and
	//different types of parameters and
	//different sequence of parameters
	
//	public void search() {
//		System.out.println("0 paramets");
//		
//	}
//	public void search(int a) {
//		System.out.println("1 parametes " + a);
//		
//	}
//	public void search(String test) {
//		System.out.println("1 parameter " + test);
//	}
//	public void search(int a, int b) {
//		System.out.println("2 parameters " + a+ " "+ b);
//		
//	}
//	public void search(int c,String d) {
//		
//	}
//	public void search(String d,int c) {
//		
//	}
	
	//search over loading
	public void search() {
		
	}
	
	public void search(String productName) {
		
	}
	public void search(String productName,int price) {
		
	}
	public void search(String name,int price,String colour) {
		
	}


	public static void main(String[] args) {
		
		AmazonSearch as=new AmazonSearch();
		as.search();
		as.search("Iphone 11");
		as.search("IPhone 11", 20000);
		
		
		
		

	}

}
