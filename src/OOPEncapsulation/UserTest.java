package OOPEncapsulation;

public class UserTest {

	public static void main(String[] args) {


		User u1=new User();
		u1.setName("Tom");
        u1.setAge(30);
        u1.setPhNumber(345267);
        
        System.out.println(u1.getName()+" "+u1.getAge()+" "+u1.getPhNumber());
        
        u1.getUserSalaryInfo();
      
        
	}

}