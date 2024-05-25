package myPackage.RegistrationLogin;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import myPackage.RegistrationLogin.objects;

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
	
	
	
	public void click(String locator,String type)throws Exception {
		if(type=="radio")
		{
			WebElement radio =driver.findElement(By.xpath(locator));
			radio.click();
		}
		if(type=="checkbox")
		{
			WebElement checkbox =driver.findElement(By.xpath(locator));
			checkbox.click();
		}
		if(type=="")
		{
			driver.findElement(By.xpath(locator)).click();
		}
	}
	public void inputext(String locator,String text)throws Exception {
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
	}
	
	public void iframeswitch(String locator)throws Exception {
		WebElement iframeelement=driver.findElement(By.xpath(locator));
		driver.switchTo().frame(iframeelement);
	}
	
	public void acceptAlert()throws Exception{
		driver.switchTo().alert().accept();
	}
	public void dismissAlert()throws Exception{
		driver.switchTo().alert().dismiss();
	}
	
	public String captureAlertText() throws Exception{
		String text=driver.switchTo().alert().getText();
		return text;
	}
	public void inputalertext(String text) throws Exception{
		driver.switchTo().alert().sendKeys(text);
		
	}
	
	
	
}
