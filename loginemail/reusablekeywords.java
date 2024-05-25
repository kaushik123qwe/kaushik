package myPackage.loginemail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class reusablekeywords extends objects{
	
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
	public void quitedriver() throws Exception {
		driver.quit();
		// kill the session (remove from Task Manager End Task)
	}
	public void closebrowser() throws Exception {
		driver.close();
		// for browser close
	}
	public void registerclick(String locator) throws Exception{
		driver.findElement(By.xpath(locator)).click();
	}
	public void loginclick(String locator) throws Exception{
		driver.findElement(By.xpath(locator)).click();
	}
	public void inputext(String locator,String text)throws Exception {
		loginclick(locator);
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
		
	}
	

}

