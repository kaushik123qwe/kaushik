package myPackage.RegistrationLogin;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import myPackage.RegistrationLogin.reuseablekeywords;

public class webshop extends reuseablekeywords {
	@Test
	public void registration() throws Exception{
		openbrowser();
		
		click(registerLink,"");  // login button click
		/*click(regGenderId,"radio");
		inputext(regFirstNameId,regFirstName);
		inputext(regLastNameId,regLastName);
		inputext(regEmailId,regemail);
		inputext(regPasswordId,regPassword);
		inputext(regConPasswordId,regConPassword);
		Thread.sleep(3000);
		click(regButtonid,"");
		Thread.sleep(3000);
		click(logoutLink,"");
		click(loginLink,"");
		inputext(loginEmailId,regemail);
		inputext(loginPasswordId,regPassword);
		click(loginRememberMeId,"checkbox");
		Thread.sleep(3000);
		click(loginButtonid,"");*/
		Thread.sleep(2000);
		driver.findElement(By.xpath(regGenderId)).click();
		

	}
	
}