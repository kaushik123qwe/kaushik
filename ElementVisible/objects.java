package myPackage.ElementVisible;

import myPackage.ElementVisible.userdata;

public class objects extends  userdata {

	String registerLink="//a[@class=\"ico-register\"]";
	String loginLink="//a[@class=\"ico-login\"]";
	String regEmailId="//input[@class=\"text-box single-line\" and @name=\"Email\"]";
	String regFirstNameId="//input[@class=\"text-box single-line\" and @name=\"FirstName\"]";
	String regLastNameId="//input[@class=\"text-box single-line\" and @name=\"LastName\"]";
	String regPasswordId="//input[@class=\"text-box single-line password\" and @name=\"Password\"]";
	String regConPasswordId="//input[@class=\"text-box single-line password\" and @name=\"ConfirmPassword\"]";
	String regGenderId="//input[@id=\"gender-male\" and @name=\"Gender\" and @type=\"radio\" and @value=\"M\"]";
	String regButtonid="//input[@id=\"register-button\"]";
	String emailvalidationmsg="//div[@class='validation-summary-errors']//li";
	
}
