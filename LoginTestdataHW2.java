package Week3;

public class LoginTestdataHW2 extends TestDataHW2{
	public void enterUsername() {
		System.out.println("Enter user name :" +"Jothi Uday" );
	}

	public void enterPassword() {
		System.out.println("Enter password" + " 000");
	}
	
	public static void main(String[] args) {
		
		LoginTestdataHW2 us = new LoginTestdataHW2();
		us.enterUsername();
		us.enterPassword();
		us.enterCredentials();
		us.navigateToHomePage();
		
	}
}



