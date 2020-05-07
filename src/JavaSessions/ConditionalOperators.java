package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
     
	//conditional operators:>,<,>=,<=,==,!=
		int a=30;
		int b=20;
		
		if(b>a) {
		    System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		int total=100;
		int tax=50;
		int totalamount=total+tax;
		int pendingamount=160;
		
		if(totalamount==pendingamount) {
			System.out.println("paid the amount");
		}
		
		else {
			System.out.println("please pay the pending amount");
		}
		
		//String comparision
		
		String s1="Hello Java";
		String s2="hello Java";
		
		if(s1.equals(s2)) {
			System.out.println("s1 and s2 are aqual");
		}
		else {
			System.out.println("s1 and s2 are not equal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {//it will ignore the case senstive letters
			System.out.println("s1 and s2 are aqual");
		}
		else {
			System.out.println("s1 and s2 are not equal");
		}
		
		//cross browser with selenium
		//if-else if
		
		String browser="CHROME";
		
		if(browser.equalsIgnoreCase("Chrome")) {//equalsignorecase will ignore the case senstive letters
			System.out.println("launch chrome");
		}
		else if(browser.equalsIgnoreCase("firefox")) {
		    System.out.println("launch firefox");
			
		}
		else if(browser.equalsIgnoreCase("IE")) {
			System.out.println("launch IE");
		}
		else {
			System.out.println("please pass the correct browser name:" + browser);
		}
		
		//marks
		
		String studentname="Swecha";
		int marks=0;
		
		if(studentname.equals("Abhi")){
			 marks=100;
			System.out.println(studentname+"---"+ marks);
		}
		else if(studentname.equals("Karthi")) {
			 marks=90;
			System.out.println(studentname+"---"+marks);
		}
		else if(studentname.equals("Suhas")) {
		     marks=80;
			System.out.println(studentname+"---"+marks);
		}
		else {
			System.out.println("This student is not avalable:"+ studentname+"---"+marks);
		}
		
		//if-if-if
		
		int amount=200;
		if(amount>=100) {
			if(amount<=150) {
				System.out.println("bill is paid");
			}
			else {
				System.out.println("bill is over paid with tip");
			}
		}
		else {
			System.out.println("bill is not paid");
		}
		
		//to print highest num
		
		int x=100;
		int y=200;
		int z=300;
		 
		if (x>y && x>z) {
			 System.out.println("x is the highest");
		}
		else if(y>z) {
			System.out.println("y is the highest");
		}
		else {
			System.out.println("z is the highest");
		}
				
				
				

	}

}
