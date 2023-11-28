package day1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	public void Tc1() {

		SoftAssert softAssert = new SoftAssert();
		System.out.println("Begining");
		String ActualTitle = "http://gmail.com";
		String ExpectedTitle = "gmail.com";
		softAssert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Ending");
		softAssert.assertAll();

	}

}
