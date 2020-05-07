package OOPEncapsulation;

public class Browser {
	
	private String browsername;
	private int Version;
	
	public void launchBrowser(String browserName) {
		intractWithOs(browserName);
		System.out.println("browser is launched " +browserName);
		
	}
	private void intractWithOs(String browserName) {
		checkRAMSpace(browserName);
	}
	private void checkRAMSpace(String browserName) {
		checkBrowserSetupFiles(browserName);
	}
	private void checkBrowserSetupFiles(String browserName) {
		checkLatestVersion(browserName);
	}
	private void checkLatestVersion(String browserName) {
		System.out.println("bowser is found--"+ browserName);
	}

}
