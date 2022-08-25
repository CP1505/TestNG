package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {	
		@Test (priority=0)
		public void sitelocation(){
			System.out.println("Browser Open");
			Reporter.log("Passed test");
		}
		@Test (priority=1)
		public void login(){
			System.out.println("Login to site");
			Reporter.log("Passed test");
		}
		@Test (priority=2)
		public void logout(){
			System.out.println("Logout from site");
			Reporter.log("Passed test");
		}
		
	
}
