package myPackage.loginRegistration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import myPackage.loginRegistration.reuseablekeywords;

public class webshop extends reuseablekeywords {
	@Test
	public void registration() throws Exception{
		openbrowser();
		
		registerlinkclick(registerLink);  // login button click
		inputextRegGender(regGenderId);
		inputextRegFirstName(regFirstNameId,regFirstName);
		inputextRegLastName(regLastNameId,regLastName);
		inputextRegEmail(regEmailId,regemail);
		inputextRegPassword(regPasswordId,regPassword);
		inputextRegConPassword(regConPasswordId,regConPassword);
		Thread.sleep(7000);
		registerButtonclick(regButtonid);
		Thread.sleep(2000); //28
		/*loginlinkclick(loginLink);28
		inputextLoginEmail(loginEmailId,regemail);
		inputextLoginPassword(loginPasswordId,regPassword);
		inputextLoginRemember(loginRememberMeId);
		Thread.sleep(7000);
		loginButtonclick(loginButtonid);28*/
		
		//
		//28click(bookLink);  
		//28Thread.sleep(2000);
		//selectByVisibleText(dropdownLink,sortbybooks);
	
		//28boolean status =elementPresent(dropdownLink);
		//28if(status)
		//28{
			//28System.out.println("Sort by dropdown present");
		//28}
		//28else
		//28{
			//28System.out.println("Sort by dropdown not present");
		//28}
		//28Thread.sleep(5000);
		//click(regButtonid);
		
		//28.04.2024
		
		String msg=getText(emailvalidationmsg);
		System.out.println(msg);
		
	}
	
}
