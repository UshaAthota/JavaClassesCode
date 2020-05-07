package JavaSessions;

public class User {
	
	//class variables
	
	String name;
	String emailId;
	long phNumber;
	boolean isActive;
	
	//class methods
	
	public String getUserOrderDetails(String userName) {
		if(userName.equals("Abhi")) {
			return "Apple mac Book";
		}
		else if(userName.equals("Karthi")) {
			return "Samsung s20";
		}
		else {
			System.out.println(userName+"not found");
			return "userName not found";
		}
		
	}
	
	public long getUserPhNumber(String userName) {
		
		if(userName.equals("Abhi")){
			return 98765;
			
		}
		else if(userName.equals("Karthi")) {
			return 765433;
		}
		else {
			System.out.println(userName +"not found");
			return 0;
		}
		
	}

	public static void main(String[] args) {
	
		
		User user1=new User();
		user1.name="Abhi";
		user1.phNumber=9888765;
		String userName=user1.getUserOrderDetails(user1.name);
		System.out.println(userName);
		
		long userPhNumber=user1.getUserPhNumber(user1.name);
		System.out.println(userPhNumber);
		
		
		
		
		

	}

}
