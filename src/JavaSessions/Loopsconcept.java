package JavaSessions;

public class Loopsconcept {

	public static void main(String[] args) {

     //to print 1 t0 10
	 //while	
		int i=1;//Initialization
		while(i<=10) {//conditional
			System.out.println(i);
			i++;//incremental/decremental
		}
		
	//for loop to print 1 to 10
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
	//to print even numbers between 1 to 10
		for(int n=2;n<=10;n=n+2) { 
			System.out.println(n);//2 4 6 8 10
		}
		
	//to print odd numbers between 1 to 10
		for(int l=1;l<=10;l=l+2) {
			System.out.println(l);//1 3 5 7 9
		}
		
	//for with if
		for(int r=1;r<=10;r++) {
			if(r%2==0) {
				System.out.println(r);
			}
		}
	//for-if 2nd example
		
		for(int d=1;d<=100;d++) {
			if(d%5==0) {
			System.out.println(d);
		   }
		}
		
    //do-while loop
		int m=10;
		do {
			System.out.println(m);
			m--;
		}
		while(m>=1);
		
		

	}

}
