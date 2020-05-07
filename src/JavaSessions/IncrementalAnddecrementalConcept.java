package JavaSessions;

public class IncrementalAnddecrementalConcept {

	public static void main(String[] args) {

     //++,-- are called incremental and decremental operators
	  //post increment means increase the value later
		 
		int x=1;
		int y=x++;//post increment 
		
		System.out.println(x);
		System.out.println(y);
		
		int p=-1;
		int q=p++;//post increment
		
		System.out.println(p);
		System.out.println(q);
				
		//pre increment
		
		int a=1;
		int b=++a;
		
		System.out.println(a);
		System.out.println(b);
		
		int h=-1;
		int g=++h;
		
		System.out.println(h);
		System.out.println(g);

		int m=2;
		int n=m--;//post decrement
		
		System.out.println(m);
		System.out.println(n);
		
		int k=-3;
		int l=--k;
		
		System.out.println(k);
		System.out.println(l);
	}

}
