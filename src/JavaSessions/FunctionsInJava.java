package JavaSessions;

import java.util.ArrayList;

/**
 * 
 * @author ushag
 *
 */

public class FunctionsInJava {
	
	//can not create a function inside a function
	//main methods also is one of function
	//data variables of class:class variables and class methods
	
	//we have 3 different types of functions
	//1.Simple function:no input and no output
	//void ca not return anything
	//return type is void
	
	public void test() {
		System.out.println("test method");
	}
	
    //2.no input but some return
	//return type is int
	
	public int getnumber() {
		System.out.println("get number");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
	
	public String getTrainerName() {
		System.out.println("get trainer name");
		String s="Naveen";
		return s;
	}
	
	//3.some input perameters and some return
	
	public int sumFunction(int a,int b) {
		System.out.println("SUM Method");
		int z=a+b;
		return z;
		
	}
	
	public int getMarks(String studentName) {
		System.out.println("get marks: " + studentName);
		int marks=-1;
		
		if(studentName.equals("Abhi")) {
			 marks=90;
		}
		else if(studentName.equals("Karthi")) {
		     marks=80;
		}
		else if(studentName.equals("Suhas")) {
			 marks=70;
		}
		else {
			System.out.println("studentName not found: "+ studentName);
			 
		}
		return marks;
		
	}
	
	/**
	 * This method returns String of name and launch the browser on the basis of browserName
	 * @param browserName
	 * @return This method returns String of name and launch the browser on the basis of browserName
	 */
	
	public String launchApp(String browserName) {
		String name=null;
		if(browserName.equals("chrome")) {
			System.out.println("launch chrome");
			name="chrome";
		}
		else if(browserName.equals("ff")) {
			System.out.println("launch ff");
			name="firefox";
		}
		else if(browserName.equals("IE")) {
			System.out.println("launch IE");
			name="Intenet Explorer";
		}
		return name;
		
		   
	}
	
	/**
	 * 
	 * @return marks
	 */
	
	public int[] getStudentMarks() {
		System.out.println("get student marks");
		int marks[]=new int[4];
		marks[0]=100;
		marks[1]=90;
		marks[2]=80;
		marks[3]=50;
		
		 
		return marks;
		
	}
	
	/**
	 * This method returns an arraylist of String-returns employee list on the basis of comapany name
	 * @param companyName
	 * @return This method returns an arraylist of String-returns employee list on the basis of comapany name
	 */
	
	public ArrayList<String> getEmployeeList(String companyName) {
		
		ArrayList<String> compList=new ArrayList<String>();
		
		if(companyName.equals("IBM")) {
			compList.add("Abhi");
			compList.add("Karthi");
			compList.add("Suhas");
		}
		else if(companyName.equals("Wells Fargo")){
			compList.add("Hari");
			compList.add("Uma");
			compList.add("Ganga");
		}
		else if(companyName.equals("At&t")) {
			compList.add("Sunil");
			compList.add("Sruna");
		}
		else {
			System.out.println("companyName name not found:"+ companyName);
	    }
	
	    return compList;	
		
     }

		
	
	
	
	
	   
	public static void main(String[] args) {
		
		FunctionsInJava obj	=new FunctionsInJava();
				obj.test();
				
				int sum =obj.getnumber();
				System.out.println(sum);
				//System.out.println(obj.getnumber());
				
				String s1=obj.getTrainerName();
				System.out.println(s1);
				
				int sum1 =obj.sumFunction(10, 30);
				System.out.println(sum1);
				
				int stuMarks=obj.getMarks("Abhi");
				System.out.println(stuMarks);
	
				int stuMarks1=obj.getMarks("Suhas");//if we need we can call the same function n times with different object reference name
				System.out.println(stuMarks1);
				
				int stuMarks2=obj.getMarks("Suhas");
				System.out.println(stuMarks2);
				
				int stuMarks3=obj.getMarks("Naveen");
				System.out.println(stuMarks3);
				
				String brname=obj.launchApp("chrome");
				System.out.println(brname);
				
				String brname1=obj.launchApp("opera");
				System.out.println(brname1);
				
				int m[]=obj.getStudentMarks();
				System.out.println(m.length);
				
				 for(int k=0;k<m.length;k++) {
				        System.out.println(m[k]);
				        }
				 
				 
	            ArrayList<String> empIBMNames=obj.getEmployeeList("IBM");
	            System.out.println(empIBMNames);
	            
	            ArrayList<String> empGoogleNames=obj.getEmployeeList("Google");
	            System.out.println(empGoogleNames);
	            		
	            		
		      
	}

}
