package TwitterQABuild;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TwitterRegisterTest {

	WebDriver driver;
	
	@BeforeClass
	public void setupbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	@AfterClass
	public void close() {
		driver.close();

	}
	@Test
	public void TwitterRegisterTesting() {
		TwitterRegisterPage tw=new TwitterRegisterPage(driver);
		
		tw.verifyTwitterRegisterPageHappeningtxt();
		tw.verifyTwitterRegisterPageJoiningtxt();
		tw.verifyTwitterRegisterPageAlreadytxt();
		tw.verifyTwitterRegisterPageSignuptxt();
		tw.verifyTwitterRegisterPageAppletxt();
		tw.verifyTwitterRegisterPageFooterlinks();
		tw.clickTwitterRegisterPageSignupbtn();
	}
	
	
	
	
	
	
	
	
	
	
}
