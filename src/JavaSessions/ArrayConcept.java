package JavaSessions;

import org.omg.Messaging.SyncScopeHelper;

public class ArrayConcept {

	public static void main(String[] args) {
		
	//limitations of array
	//1.static array(means size of array is fixed)
	//2.it can only store similar types of data
    //to solve the above limitations we use ArraList(dynamic arrays)
		
	//int array:
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		
		
		System.out.println(i[0]);//10
		System.out.println(i[1]);//20
		System.out.println(i[2]);//30
		System.out.println(i[3]);//0 (because we did not assign the value for i[3] it will takes defalut value 0)
		//System.out.println(i[4]);//array outofBoundsException(because the length is 3)
		
		System.out.println(i.length);//to get the length
		  int len=i.length;
		System.out.println("LowestIndex: "+0);
		System.out.println("HighestIndex: " +(len-1));
		
	//to print all the valuse of array we have to use for loop
		for(int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}
		
		
		int p[]=new int[10];
		p[0]=100;
		p[1]=200;
		
		System.out.println(p[2]);
		
	//double array:
		
		double d[]=new double[3];
		d[0]=12.22;
		d[2]=100;
		
		System.out.println(d[0]);//12.22
		System.out.println(d[1]);//0.0(it will take default value because we did not assign the value for d[1])
		System.out.println(d[2]);//100.0
		
		System.out.println(d.length);//to get array length
		
     //char array
		
		int a[]=new int[3];
		a[0]='a';
		a[1]='3';
		
		
		System.out.println(a[1]);//51 (Asci value)
		System.out.println(a[2]);//0 (because we did not assign value,it default value 0)
	
	//boolean array
		
		boolean flag[]=new boolean[3];
		flag[0]=true;
		flag[1]=false;
		//flag[3]=true; //because of this also we will get ArrayIndexOutOfBoundsException because size is 2
	
		
		System.out.println(flag[0]);
		System.out.println(flag[1]);
		System.out.println(flag[2]);//false(because we din not assign the valuse it will take default value false) 
		//System.out.println(flag[3]);////ArrayIndexOutOfBoundsException
		
	//String array
		
		String s[]=new String[4];
		s[0]="Abhi";
		s[1]="Karthi";
		s[2]="Suhas";
		
		System.out.println(s[2]);
		System.out.println(s[3]);//null(because we did not assign the value it takes default value null)
		
	//to get all the values of string array we use for loop
		
		for(int k=0;k<s.length;k++) {
			System.out.println(s[k]);
			
			}
		
	//Object array(by using object array we can store differen types of data)
	//size of object array is fixed
	
		
		Object o[]=new Object[4];
		o[0]="Abhi";
		o[1]=2;
		o[2]='m';
		o[3]="USA";
		
		System.out.println(o[3]);
		
	//to get all the values of object array we use for loop
		
		for(int b=0;b<o.length;b++) {
			System.out.println(o[b]);
		}
				
	
		
	}

}
