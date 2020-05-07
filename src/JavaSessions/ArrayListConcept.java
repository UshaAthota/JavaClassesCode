package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
	//ArrayList is default class (existing class in java)
	//ArrayList is so dynamic in nature
		
		
		ArrayList ar=new ArrayList();
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		
		//ar.remove(3);//to remove particular value
		
		System.out.println(ar.size());
		System.out.println(ar.get(2));//to get particular value
		//System.out.println(ar.get(5));//IndexOutOfBoundsException
		
	//to get all the values we use for loop
		
		for(int x=0;x<ar.size();x++) {
			System.out.println(ar.get(x));
		}
		
	//ArrayList with Integer data
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		ar1.add(300);
		
		System.out.println(ar1.get(2));
		
		ArrayList<String> ar2=new ArrayList<String>();
		
		ar2.add("Abhi");
		ar2.add("Karthi");
		ar2.add("Suhas");
		
		ArrayList<Object> ar3=new ArrayList<Object>();
		
		ar3.add("Abhi");
		ar3.add(2);
		ar3.add('m');
		ar3.add(true);
		
		
		
		

		
		

	}

}
