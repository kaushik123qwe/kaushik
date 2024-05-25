package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class reusablekeywords extends objects {
	
	public static WebDriver driver;
	public static WebDriver openbrowser() throws Exception {
		if(browser=="chrome")
		{
			System.setProperty("webdriver.chrome.driver",chromedriverpath);
			driver=new ChromeDriver();
		}
		if(browser=="firefox")
		{
			System.setProperty("webdriver.gecko.driver",firefoxdriverpath);
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

	public void quitdriver() {
		driver.quit();
		
	}
	public void closebrowser() {
		driver.close();
	}
	
	public void click(String locator) throws Exception {
		driver.findElement(By.xpath(locator)).click();
		
	}
	
	public void inputtext(String locator, String text) throws Exception {
		
		click(locator);
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
		
	}
}
