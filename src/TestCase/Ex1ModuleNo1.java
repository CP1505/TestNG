package TestCase;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex1ModuleNo1 {
	@BeforeTest(alwaysRun = true)
	public void OpenDatabase() {
		System.out.println("Databse is opened");
	}
	@AfterTest(alwaysRun = true)
	public void CloseDatabase() {
		System.out.println("Databse is Closed");
	}
	@BeforeClass(alwaysRun = true)
	public void OpenBrowser() {
		System.out.println("Opened Chrome browser");
	}
	@AfterClass(alwaysRun = true)
	public void CloseBrowser() {
		System.out.println("Closed Chrome browser");
	}
	@Test(priority = 1,invocationCount =2,groups ="FirstTest" )
	public void Sanitytest() {
		System.out.println("This is the Sanity test");
		Reporter.log("SanityTest");
	}
	@Test(priority = 2,invocationCount = 2,groups = "FirstTest")
	public void Smoketest() {
		System.out.println("This is the Smoke test");
		Reporter.log("SmokeTest");   
	}
	
	
	

}
