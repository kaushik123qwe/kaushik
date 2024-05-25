package myPackage.ElementVisible;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import myPackage.ElementVisible.objects;

public class reuseablekeywords  extends objects{
	
	public static WebDriverWait wait;
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
	
	public void elementVisible(String locator,int time) throws Exception {
		wait=new WebDriverWait(driver,java.time.Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
	
	public String getText(String locator) throws Exception {
		String text=driver.findElement(By.xpath(locator)).getText();
		return text;
	}
	
	public String getUrl() throws Exception {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url;
		//String demo=driver.getTitle();
		//System.out.println(demo);
		//return demo;
	}
	
	public void navigatetoUrl(String url) throws Exception {
		driver.navigate().to(url);
		Thread.sleep(3000);
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

}
