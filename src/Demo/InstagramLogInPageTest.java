package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InstagramLogInPageTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
	@Test
	public void InstagramSignUpPageTest() {
		InstagramLogInPage insta=new InstagramLogInPage(driver);
		insta.verifyInstagramLogInPageInstaLogo();
		insta.verifyInstagramLogInPageAppstoreLogo();
		insta.verifyInstagramLogInPagePlaystoreLogo();
		insta.clickInstagramLogInPageSignUpLink();
		insta.setInstagramLogInPageEmailId();
		insta.setInstagramLogInPageFullName();
		insta.setInstagramLogInPageUsername();
		//insta.setInstagramLogInPagePassword();
		//insta.clickInstagramLogInPageSignup();
		
		
	}
	
	
	
	
	

}
