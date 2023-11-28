package day1;

import org.testng.annotations.Test;

import Base.Base;

public class TestbasicAuth extends Base{
	
	@Test
	public void TC1() {
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
