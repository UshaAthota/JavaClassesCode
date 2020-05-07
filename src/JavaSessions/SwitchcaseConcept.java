package JavaSessions;

public class SwitchcaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i=2;
      switch (i) {
	case 1:
		System.out.println("case 1");
		break;
	case 2:
		System.out.println("case 2");
		break;
	case 3:
		System.out.println("case 3");
		break;
	case 4:
		System.out.println("case 4");
		break;
	default:
		System.out.println("no case found");
		break;
	}
     
      // launch browser using swich case
      
      String browsername="chrome";
      switch (browsername) {
	case "chrome":
		System.out.println("launch chrome");
		break;
	case "ff":
		System.out.println("launch ff");
		break;
	case "IE":
		System.out.println("launch IE");
		break;
	case "safari":
		System.out.println("launch safari");
		break;

	default:
		System.out.println("Browser not found "+ browsername);
		
		break;
	}
      
      
	
 }

}
