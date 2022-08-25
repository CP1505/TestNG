package AssertsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssPractice {
	@Test
	public void Test() {
		SoftAssert Soft=new SoftAssert();
		String name="rakhi";
		String sname="jay";
		//Assert.assertEquals(name, sname);
		Soft.assertEquals(name,"ka");
		Soft.assertAll();
	}

}
