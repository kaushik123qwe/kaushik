package myPackage.ElementVisible;

import org.testng.annotations.Test;

import myPackage.ElementVisible.reuseablekeywords;

public class webshop extends reuseablekeywords {

	@Test
	public void registration() throws Exception{
		openbrowser();
		
		/*click(registerLink,""); 
		click(regGenderId,"radio");
		inputext(regFirstNameId,regFirstName);
		inputext(regLastNameId,regLastName);
		inputext(regEmailId,regemail);
		inputext(regPasswordId,regPassword);
		inputext(regConPasswordId,regConPassword);
		Thread.sleep(3000);
		click(regButtonid,"");
		Thread.sleep(3000);
		
		String msg=getText(emailvalidationmsg);
		System.out.println(msg);*/
		
		getUrl();
		
	}
}
