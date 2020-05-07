package JavaSessions;

public class BasicOperators {

	public static void main(String[] args) {
     
		int x=0/9;
		System.out.println(x);
		
		int p=10;
		int q=p%2;//0(beacuse 10 compltely divisible by 2)
		
		System.out.println(q);
		
		int num=15;
		if(num%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
		
		
		if(num>0) {
			System.out.println("given number is positive");
		}
		else if(num<0) {
			System.out.println("given number is negative");
		}
		else {
			System.out.println("given number is zero");
		}
		
		//Ternary operators
		
		int z=12;
		String s=(z>10) ? "hi" : "Bye";
		System.out.println(s);
		
		int n1=5;
		int n2=10;
		int max;
		
		max=(n1>n2) ? n1 :n2 ;
		
		System.out.println("max number is:" +max);
		

        //dead code means we r explicitly saying this is always true it will never go else part
		if(true) {
			System.out.println("this is true");
		}
		else {
			System.out.println("false");
		}
      // !(not operator)
		boolean flag=true;
		if(!flag) {
			System.out.println("this is java");
		}
		else {
			System.out.println("bye!!");
			
		}
		
		String name="Tom";
		if(!name.equals("")) {
			System.out.println("name is:"+name);
			
		}
		else {
			System.out.println("value is blank");
		}
		
		

	}

}



		
