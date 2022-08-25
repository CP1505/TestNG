package TestCase;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ex1ModuleNo2 {
	
	@BeforeClass
	public void OpenBrowser() {
		System.out.println("Opened Chrome browser");
	}
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Closed Chrome browser");
	}
	@Test(priority = 3,groups = "SecondTest")
	public void FunctionalTest() {
		System.out.println("This is the Functional test");
		Reporter.log("FunctionalTest");
	}
	@Test(priority = 4,groups = "SecondTest")
	public void FunctionalCoveragesTest() {
		System.out.println("This is the Functional test");
		Reporter.log("checkedTest");
	}
	@Test(priority = 5,groups = "SecondTest")
	public void BehaviriolCoverageTest() {
		System.out.println("This is the BehaviriolCoverage test");
	}
	@Test(priority = 6,groups = "SecondTest")
	public void InputDomainCoverageTest() {
		System.out.println("This is the InputDomain test");
		Reporter.log("Checked Coverage");
	}
	@Test(priority = 7,groups = "SecondTest")
	public void ErrorhandalingCoverageTest() {
		System.out.println("This is the Errorhandaling test");
		Reporter.log("Checked Coverage");
	}
	@Test(priority = 8,groups = "SecondTest")
	public void BackendCoverageTest() {
		System.out.println("This is the Backend test");
		Reporter.log("Checked Coverage");
	}
	@Test(priority = 9,groups = "SecondTest")
	public void ServiceBaseCoverageTest() {
		System.out.println("This is the ServiceBase test");
		Reporter.log("Checked Coverage");
	}
	@Test(priority = 10,groups = "SecondTest")
	public void CalculationBaseCoverageTest() {
		System.out.println("This is the CalculationBase test");
		Reporter.log("Checked Coverage");
	}
	
	

}
