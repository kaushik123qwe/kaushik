package myPackage.RegistrationLogin;

import myPackage.RegistrationLogin.userdata;

public class objects extends  userdata {
	
	String registerLink="//a[@class=\"ico-register\"]";
	String loginLink="//a[@class=\"ico-login\"]";
	String regEmailId="//input[@class=\"text-box single-line\" and @name=\"Email\"]";
	String regFirstNameId="//input[@class=\"text-box single-line\" and @name=\"FirstName\"]";
	String regLastNameId="//input[@class=\"text-box single-line\" and @name=\"LastName\"]";
	String regPasswordId="//input[@class=\"text-box single-line password\" and @name=\"Password\"]";
	String regConPasswordId="//input[@class=\"text-box single-line password\" and @name=\"ConfirmPassword\"]";
	String regGenderId="//input[@id=\"gender-"+gender+"\"]";
	String regButtonid="//input[@id=\"register-button\"]";
	String loginEmailId="//input[@class=\"email\"]";
	String loginPasswordId="//input[@class=\"password\" and @id=\"Password\" and @name=\"Password\" and @type=\"password\"]";
	String loginRememberMeId="//input[@id=\"RememberMe\" and @name=\"RememberMe\" and @type=\"checkbox\" and @value=\"true\"]";
	String loginButtonid="//input[@class=\"button-1 login-button\" and @type=\"submit\" and @value=\"Log in\"]";
	String logoutLink="//a[@class=\"ico-logout\"]";

}
