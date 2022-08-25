package FacebookPMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterationFacebook {
	//Decleration
	@FindBy(xpath = "//a[text()='Sign Up']")private WebElement facebook_signup;
	@FindBy(xpath = "//img[@alt='Facebook']")private WebElement facebook_Logo;
	@FindBy(xpath = "//div[text()='Create a new account']")private WebElement facebook_createnewaccount;
	@FindBy(xpath = "//input[@name='firstname']")private WebElement facebook_firstname;
	@FindBy(xpath = "//input[@name='lastname']")private WebElement facebook_surname;
	@FindBy(xpath = "//input[@name='reg_email__']")private WebElement facebook_mobnoemailid;
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")private WebElement facebook_mobnoemailidconfirmation;
	@FindBy(xpath = "//input[@id='password_step_input']")private WebElement facebook_newpassword;
	@FindBy(xpath ="//select[@name='birthday_day']")private WebElement facebook_birthday;
	@FindBy(xpath ="//select[@name='birthday_year']")private WebElement facebook_birthyear;
	@FindBy(xpath ="//select[@name='birthday_month']")private WebElement facebook_birthmonth;
	@FindBy(xpath ="//label[text()='Female']")private WebElement facebook_female;
	@FindBy(xpath ="//label[text()='Male']")private WebElement facebook_male;
	@FindBy(xpath ="//button[@name='websubmit']")private WebElement facebook_signupbtn;
	@FindBy(xpath ="//a[text()='Already have an account?']")private WebElement facebook_areadyacco;
	
	//initialization
	public RegisterationFacebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void clickFacebookSignupLink() {
		facebook_signup.click();
	}
	public void verifyFacebookLogo() {
		Assert.assertTrue(facebook_Logo.isDisplayed(),"Facebook Logo Is not Displyed");
	}
	public void verifyFacebookCreateNewAccount() {
		Assert.assertTrue(facebook_createnewaccount.isDisplayed()," Create new account is not Displyed");
		Assert.assertEquals(facebook_createnewaccount.getText(), "Create a new account");
	}
	public void setFacebookFirstname() {
		facebook_firstname.sendKeys("Anuradha");
	}
	public void setFacebookSurname() {
		facebook_surname.sendKeys("Mane");
	}
	public void setFacebookMobileEmail() {
		facebook_mobnoemailid.sendKeys("anu@gmail.com");
	}
	public void resetFacebookMobileEmailConfirmation() {
		facebook_mobnoemailidconfirmation.sendKeys("anu@gmail.com");
	}
	public void setFacebookPassword() {
		facebook_newpassword.sendKeys("Anu@235647852");
	}
	public void setFacebookBirthDay() {
		Select bday =new Select(facebook_birthday);
		Assert.assertTrue(facebook_birthday.isDisplayed(),"facebook birthday is not displayed");
		Assert.assertFalse(facebook_birthday.isSelected());
		bday.selectByVisibleText("16");
	}
	public void setFacebookBirthMonth() {
		Select bday =new Select(facebook_birthmonth);
		Assert.assertTrue(facebook_birthmonth.isDisplayed(),"facebook birthmonth is not displayed");
		Assert.assertFalse(facebook_birthmonth.isSelected());
		bday.selectByVisibleText("Feb");
	}
	public void setFacebookBirthYear() {
		Select bday =new Select(facebook_birthyear);
		Assert.assertTrue(facebook_birthyear.isDisplayed(),"facebook birthyear is not displayed");
		Assert.assertFalse(facebook_birthyear.isSelected());
		bday.selectByVisibleText("1996");
	}
	public void clickFacebookGenderMaleAndFemale(String sex) {
		if(sex.equalsIgnoreCase("male")) {
			facebook_male.click();
		}else if(sex.equalsIgnoreCase("female")) {
			facebook_female.click();
		}else {
			System.out.println("Non Of the Above Clicked");
		}
	}
	
	public void verifyFacebookAlreadyHaveAcco() {
		Assert.assertTrue(facebook_areadyacco.isDisplayed()," Already have an account is not Displyed");
		Assert.assertTrue(facebook_areadyacco.isEnabled(),"Facebook already have an account? option is not Enabled on registration page");
		Assert.assertEquals(facebook_areadyacco.getText(), "Already have an account?");
	}
	public void clickFacebookSignupBtn() {
		facebook_signupbtn.click();
	}
	

	
}
