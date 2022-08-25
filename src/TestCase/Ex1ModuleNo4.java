package TestCase;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ex1ModuleNo4 {
	@BeforeClass
	public void OpenBrowser() {
		System.out.println("Opened Chrome browser");
	}
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Closed Chrome browser");
	}
	@Test(priority = 15,groups = "ThirdTest")
	public void InstallationTest() {
		System.out.println("This is the Installation test");
		Reporter.log("Installed succesfully");
	}
	@Test(priority = 16,groups = "ThirdTest")
	public void GlobalizationTest() {
		System.out.println("This is the Globalization test");
		Reporter.log("Done succesfully");
	}
	@Test(priority = 17,groups = {"FirstTest","SecondTest"})
	public void Combinedtest12() {
		System.out.println("This is the Combinedtest12");
		Reporter.log("Done succesfully");
	
	}
	@Test(priority = 18,groups = {"SecondTest","ThirdTest"})
	public void Combinedtest32() {
		System.out.println("This is the Combinedtest23");
		Reporter.log("Done succesfully");
	}
	@Test(priority = 18,groups = {"SecondTest","ThirdTest","FirstTest"})
	public void Combinedtest231() {
		System.out.println("This is the Combinedtest231");
		Reporter.log("Done succesfully");
	}
}