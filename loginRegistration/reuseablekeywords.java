package myPackage.loginRegistration;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class reuseablekeywords extends objects{
	
	public static WebDriver driver;
	
	public static WebDriverWait wait;
	
	// driver is the object of a WebDriver interface
	public static WebDriver openbrowser() throws Exception {
		if(cbrowser=="chrome")
		{
			System.setProperty("webdriver.chrome.driver", chromedriverpath);
			driver=new ChromeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	public void registerlinkclick(String locator) throws Exception{
		driver.findElement(By.xpath(locator)).click();
	}
	public void registerButtonclick(String locator) throws Exception{
		driver.findElement(By.xpath(locator)).click();
	}
	public void loginlinkclick(String locator) throws Exception{
		driver.findElement(By.xpath(locator)).click();
	}
	public void loginButtonclick(String locator) throws Exception{
		driver.findElement(By.xpath(locator)).click();
	}
	public void inputextRegGender(String locator)throws Exception {
		WebElement radio =driver.findElement(By.xpath(locator));
		radio.click();
	}
	public void inputextRegFirstName(String locator,String text)throws Exception {
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
		
	}
	public void inputextRegLastName(String locator,String text)throws Exception {
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
		
	}
	public void inputextRegEmail(String locator,String text)throws Exception {
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
	}
	public void inputextRegPassword(String locator,String text)throws Exception {
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
		
	}
	public void inputextRegConPassword(String locator,String text)throws Exception {
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
		
	}
	public void inputextLoginEmail(String locator,String text)throws Exception {
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
		
	}
	public void inputextLoginPassword(String locator,String text)throws Exception {
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
		
	}
	public void inputextLoginRemember(String locator)throws Exception {
		WebElement checkbox =driver.findElement(By.xpath(locator));
		checkbox.click();
	}
	
	public void selectByVisibleText(String locator,String text)throws Exception 
	{
		Select dropdown=new Select(driver.findElement(By.xpath(locator)));
		dropdown.selectByVisibleText(text);
	}
	
	public void click(String locator) throws Exception{
		driver.findElement(By.xpath(locator)).click();
	}
	
	public boolean elementPresent(String locator)
	{
		try
		{
			driver.findElement(By.xpath(locator));
			return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	}
	
	// 28.04.2024
	
	public void elementVisible(String locator,int time)throws Exception
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		
	}
	public String getText(String locator)throws Exception{
		String text=driver.findElement(By.xpath(locator)).getText();
		return text;
	}
	
	

}