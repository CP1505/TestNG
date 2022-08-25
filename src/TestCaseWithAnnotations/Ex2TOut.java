package TestCaseWithAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex2TOut {
	@Test(priority = 0,invocationCount = 3,threadPoolSize = 5)
	public void chrometest() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
