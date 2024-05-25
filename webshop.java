package myPackage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class webshop extends reusablekeywords {
	
	@Test
	public void registration() throws Exception{
		openbrowser();
		Thread.sleep(3000);
		//click(registerLink);
		click(loginLink);
		inputtext(emailid, email);
		
	}

	//@AfterTest
	//public void aftertest() {
		//quitdriver();
		//closebrowser();
		
	//}
}
