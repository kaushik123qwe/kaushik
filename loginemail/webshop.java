package myPackage.loginemail;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import myPackage.loginemail.reusablekeywords;

public class webshop extends reusablekeywords{
	
	@Test
	public void registration() throws Exception{
		openbrowser();
		//Thread.sleep(3000); // works as timer for 3 seceond
		//registerclick(registerLink); // register button click
		loginclick(loginLink);  // login button click
		inputext(emailid,email);
	}
	
	// for browser and task manager close
	//@AfterTest
	//public void aftertest() throws Exception {
		//quitedriver();
		//closebrowser();
		
	//}
	// end

}
