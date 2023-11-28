package day4;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.Base;

public class SoftAssert1 extends Base {
	@Test
	public void Tc1() {
		SoftAssert softassert = new SoftAssert();

		softassert.assertAll();
	}

}
