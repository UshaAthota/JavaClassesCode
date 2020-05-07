package OOPEncapsulation;

public class Credentials {
	
	private String userName;
	private String passWord;
	
	
	public Credentials() {//default constructor(using it for setter)
		
	}


	public Credentials(String userName, String passWord) {
		
		this.userName = userName;
		this.passWord = passWord;
	}
	
	
    public String getUserName() {
		return userName;
	}

    public void setUserName(String userName) {
		this.userName = userName;
	}

    public String getPassWord() {
		return passWord;
	}

    public void setPassWord(String passWord) {
		this.passWord = passWord;
	}





	public static void main(String[] args) {



	}

}
