package myPackage.browseropen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class reuseablekeywords extends objects{
	
	public static WebDriver driver;
	// driver is the object of a WebDriver interface
	public static WebDriver openbrowser() throws Exception {
		if(cbrowser=="chrome")
		{
			System.setProperty("webdriver.chrome.driver", chromedriverpath);
			driver=new ChromeDriver();
			// create object(driver) of a ChromeDriver()
		}
		//if(fbrowser=="firefox")
		//{
			//System.setProperty("webdriver.gecko.driver", firefoxdriverpath);
			//driver=new FirefoxDriver();
			// create object(driver) of a FirefoxDriver()
		//}
		driver.get(url);
		//pass the url for specific browser for reload;
		driver.manage().window().maximize();
		// for browser full open
		return driver;
	}

}
