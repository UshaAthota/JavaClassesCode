package OOPEncapsulation;

public class LoginPage {

	public static void main(String[] args) {
	//case 1:setting the class variables through constructor
	    Credentials cred=new Credentials("admin","admin123");
		 
		System.out.println(cred.getUserName());
		System.out.println(cred.getPassWord());
		
	//case 2:setting the class variables through setter
		Credentials cred1=new Credentials();
		cred1.setUserName("Naveen");
		cred1.setPassWord("naveen123");
		
		System.out.println(cred1.getUserName());
		System.out.println(cred1.getPassWord());
	}

}
