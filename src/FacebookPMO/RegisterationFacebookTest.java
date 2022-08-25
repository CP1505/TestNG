package FacebookPMO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterationFacebookTest {
	//TestClass
	WebDriver driver;
	@BeforeClass
	public void setupbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	@AfterClass
	public void close() {
		driver.close();
	}
	@Test
	public void FacebookTestSginUpPage() {
		RegisterationFacebook fb=new RegisterationFacebook(driver);
		fb.clickFacebookSignupLink();
		fb.verifyFacebookLogo();
		fb.verifyFacebookCreateNewAccount();
		fb.setFacebookFirstname();
		fb.setFacebookSurname();
		fb.setFacebookMobileEmail();
		fb.resetFacebookMobileEmailConfirmation();
		fb.setFacebookPassword();
		fb.setFacebookBirthDay();
		fb.setFacebookBirthMonth();
		fb.setFacebookBirthYear();
		fb.clickFacebookGenderMaleAndFemale("female");
		fb.verifyFacebookAlreadyHaveAcco();
		fb.clickFacebookSignupBtn();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
