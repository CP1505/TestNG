package TestCase;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ex1ModuleNo3 {
	@BeforeClass
	public void OpenBrowser() {
		System.out.println("Opened Chrome browser");
	}
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Closed Chrome browser");
	}
	@Test(priority = 11,groups = "ThirdTest")
	public void NonFunctionalTest() {
		System.out.println("This is the NonFunctional test");
		Reporter.log("Checked NonFunctionalTest");
	}
	@Test(priority = 12,groups = "ThirdTest")
	public void RecoveryTest() {
		System.out.println("This is the Recovery test");
		Reporter.log("Checked Recovery");
	}
	@Test(priority = 13,groups = "ThirdTest")
	public void CompatibilityTest1() {
		System.out.println("This is the Compatibility test");
		Reporter.log("Checked Compatibility");
	}
	@Test(priority = 14,groups = "ThirdTest")
	public void ConfigurationTest() {
		System.out.println("This is the Configuration test");
		Reporter.log("Checked Config");
	}
	

}
