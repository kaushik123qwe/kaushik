package myPackage.DropdownText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import myPackage.DropdownText.objects;

public class reuseablekeywords extends objects{
	
	public static WebDriver driver;
	
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
	
	public void selectByVisibleText(String locator,String text){
		Select dropdown=new Select(driver.findElement(By.xpath(locator)));
		dropdown.selectByVisibleText(text);
	
	}
	public void click(String locator) throws Exception{
		driver.findElement(By.xpath(locator)).click();
	}
	
	public void selectByValue(String locator,String Value){
		Select dropdown=new Select(driver.findElement(By.xpath(locator)));
		dropdown.selectByValue(Value);
	
	}
	
	public void selectByIndex(String locator,int index){
		Select dropdown=new Select(driver.findElement(By.xpath(locator)));
		dropdown.selectByIndex(index);
	
	}
	public boolean elementPresent(String locator) {
		
		try
		{
			driver.findElement(By.xpath(locator)).click();
			return true;
		}
		catch(Exception ex)
		{
			ex.toString();
			return false;
		}
	}
	
}
