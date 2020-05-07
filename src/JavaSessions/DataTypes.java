package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
 
  //data types:
  //1.primitive data types:we have two types of primitive data types
		//a. boolean data types:true/false
		//b.numeric data types:we have integer type and floating type
		        //integer type:byte,short,int,long
		        //floating type:float,double
 //2.non primitive data types:String,array
		
		
		//byte:
		//size:1 byte=8 bits
		//range:-128 to 127
		  
		byte b=10;
		     b=20;
		byte b1=-1;
		byte b2=0;
		
		System.out.println(b);
		
		System.out.println(b2+b);
		
		//short:
		//size:16 bits=2bytes
		//range:-32768 to 32767
		
		short sh=100;
		short sh1=-90;
		
		System.out.println(sh1);
		
		//int:
		//size:32 bits=4 bytes
		
		int i=20;
		int k=-200;
		int l=0;
		
		System.out.println(i+k*l);
		
		//long:
		//size:64 bits=8 bytes
		
		long l1=2000000;
		
		//float:
		//size:32 bits=4 bytes
		//range:up to 7 decimal digits
		
		float f=12.33f;
		float f1=(float)21.22;
		float f2=100;
		
		System.out.println(f1);
		System.out.println(f2);
		
		//double:
		//size:64 bits=8 bytes
		//range:upto 16 decimal digits
		
		double d1=12.223;
		
		System.out.println(d1);
		
		//char:
		//size:16 bits=2 bytes
		
		char c1='a';//97(Asci value)
		char c2='b';//98(Asci value)
		char c3='$';
		char c4='5';
		
		System.out.println(c1+c2);//because of Asci value it will give 195(97+98)
		//a to z:97 to 122
		//A to Z:65 to 90
		//0 to 9:48 to 57
		
		
		//boolean type:true or false
		//size:1 bit
		
		boolean flag1=true;
		boolean flag2=false;
		
		//String
		// we always write capital S for String because String is not a keyword its class in java
		
		String str="hello";
		System.out.println(str);
		
		String str1="1000";
		System.out.println(str1+20);
		
		String str2="first java code";
	    
		System.out.println(str2+" "+str1);
		
			
				
		
		

		
		// to print highest number
		
  /*  int a=500;
    int b=800;
    int c=700;
    int d=400;
    
    if(a>=b && a>=c && a>=d) {
    	System.out.println("a is highest");
    }
    else if(b>=c && b>=d) {
    	System.out.println("b is highest");
    }
    else if(c>=d) {
    	System.out.println("c is highest");
    }
    else {
    	System.out.println("d is highest");
    }*/

	}

}
