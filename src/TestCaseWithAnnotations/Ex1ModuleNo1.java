package TestCaseWithAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Ex1ModuleNo1 {
	@BeforeTest
	public void OpenDatabase() {
		System.out.println("Databse is opened");
	}
	@AfterTest
	public void CloseDatabase() {
		System.out.println("Databse is Closed");
	}
	@BeforeClass
	public void OpenBrowser() {
		System.out.println("Opened Chrome browser");
	}
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Closed Chrome browser");
	}
	
	

}
