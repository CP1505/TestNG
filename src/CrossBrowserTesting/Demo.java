package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@Parameters("browser")
	@Test(priority = 1)
	public void CrossBrowserTesting(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else {
			System.out.println("Wrong browser selected");
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);		
	}
	
	@Test(priority = 2)
	public void verifycurrenturl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	@Test(priority = 3)
	public void verifypagetitle() {
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
	}
	@Test(priority = 4)
	public void verifyusername() {
		WebElement Username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		Assert.assertTrue(Username.isDisplayed());
		Username.sendKeys("anuradha125");
	}
	@Test(priority = 5)
	public void verifypasswordfield() {
		WebElement Password = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		Assert.assertTrue(Password.isEnabled());
		Password.sendKeys("5648@5465");
	}
	@Test(priority = 6)
	public void verifyloginbutton() {
		WebElement Button = driver.findElement(By.xpath("//button[@type='submit']"));
		Assert.assertTrue(Button.isEnabled());
		Button.click();
	}
		
	

}
