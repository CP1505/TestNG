package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InstagramLogInPage {
	//POM Class
	//Decleration
	@FindBy (xpath ="//img[@alt='Instagram']") private WebElement instagram_logo;
	@FindBy (xpath ="//img[@alt='Download on the App Store']") private WebElement appstore_logo;
	@FindBy (xpath ="//img[@alt='Get it on Google Play']") private WebElement playstore_logo;
	@FindBy (xpath ="//span[text()='Sign up']") private WebElement signuplink;
	@FindBy (xpath ="//a[text()='Forgot password?']") private WebElement forgetpassword;
	@FindBy (name ="Don't have an account? ") private WebElement donthaveanaccount;
	@FindBy (xpath ="//p[text()='Get the app.']") private WebElement gettheapp;
	@FindBy (xpath ="//span[text()='Log in with Facebook']") private WebElement loginwithfacebooklink;
	@FindBy (name ="emailOrPhone") private WebElement emailorphoneno;
	@FindBy (xpath ="//input[@name='fullName']") private WebElement fullname;
	@FindBy (xpath ="//input[@name='username']") private WebElement username;
	@FindBy (xpath ="//input[@type='password']") private WebElement password;
	@FindBy (xpath ="//button[text()='Sign up']") private WebElement signupbutton;
	
	// initiallization
	
	public InstagramLogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Usage
	
	public void verifyInstagramLogInPageInstaLogo() {
		Assert.assertTrue(instagram_logo.isDisplayed(),"Instagram logo is not displayed on login page");
	}
	public void verifyInstagramLogInPageAppstoreLogo() {
		Assert.assertTrue(appstore_logo.isDisplayed(),"Appstore logo is not displayed on login page");
	}
	public void verifyInstagramLogInPagePlaystoreLogo() {
		Assert.assertTrue(playstore_logo.isDisplayed(),"Playstore logo is not displayed on login page");
	}
	public void clickInstagramLogInPageSignUpLink() {
		signuplink.click();
	}
	public void setInstagramLogInPageEmailId() {
		emailorphoneno.sendKeys("anu@gmail.com");
	}
	public void setInstagramLogInPageFullName() {
		fullname.sendKeys("Anuradha");
	}
	public void setInstagramLogInPageUsername() {
		username.sendKeys("anu78c");
	}
	public void setInstagramLogInPagePassword() {
		username.sendKeys("C@anu788acda");
	}
	public void clickInstagramLogInPageSignup() {
		signupbutton.click();
	}
	
	
	
	
	

}
