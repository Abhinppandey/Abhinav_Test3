package day5;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.Base;

public class SoftAsserts extends Base {
	@Test
	public void Tc1() {
		System.out.println("hi");
		String Actualresult = "http://gmail.com";
		String Expectedresult = "gmail.com";
		SoftAssert softAssert = new SoftAssert();

		System.out.println("Bye");
		softAssert.assertAll();
	}

}
