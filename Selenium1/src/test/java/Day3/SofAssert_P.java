package Day3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SofAssert_P {
	@Test
	public void Tc1() {
		System.out.println("Hi");
		SoftAssert softassert=new SoftAssert();
		String ActualTitle="http://google.com";
		String ExpectedTitle="http://gmail.com";
		softassert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Bye");
		softassert.assertAll();
	}
	

}
