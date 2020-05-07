package JavaSessions;

public class LoginPage {
	
	public void login() {
		System.out.println("default login");
		
	}
	public void login(long number) {
		System.out.println("login with ph number "+ number);
		
	}
	public void login(String userName,String password) {
		
	}
	public void login(String userName,String password,long phNumber) {
		
	}
	public void login(String socialMediaId) {
		
	}
	
	public void waitForElement(String element) {
		
	}
	public void waitForElement(String element,int timeout) {
		
	}
	public void waitForElement(String element,int timeout,String pageTitle) {
		
	}

	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.login("usha", "ushagpt");
		lp.login("ushaFacebook");


	

	}

}
