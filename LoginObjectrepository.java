package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginObjectrepository {
WebDriver driver;
	
	@FindBy(id = "userName")
	WebElement username;
	
	@FindBy(id  = "password")
	WebElement password;
	
	@FindBy(id= "login")
	WebElement loginbtn;
	
	
	@FindBy(id = "newUser")
	WebElement newuserbutton;
	
	@FindBy(id= "submit")
	WebElement logOutlink;
	
	public LoginObjectrepository ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32 (4)\\\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		
		PageFactory.initElements(driver, this);
	
	}
	
	public void launchApplication()
	{
		driver.get("https://demoqa.com/login");
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void enterUserName(String un)
	{
		username.sendKeys(un);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickButton()
	{
		WebElement loginbtn=driver.findElement(By.id("login"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbtn);
	}
	
	public void isnewuserDisplayed() {
		try
		{
		boolean newuserStatus =newuserbutton .isDisplayed();
		Assert.assertTrue(newuserStatus);
		}catch(NoSuchElementException e)
		{
			Assert.assertTrue(false);
			System.out.println("newuser is not getting displayed");
		}
	}
		

	public void isLogoutDisplayed()
	{
		try
		{
		boolean logoutStatus = logOutlink.isDisplayed();
		Assert.assertTrue(logoutStatus);
		}catch(NoSuchElementException e)
		{
			Assert.assertTrue(false);
			System.out.println("Logout link is not getting displayed and User is not able to log in with valid username and valid password");
		}		
	}
	
}



