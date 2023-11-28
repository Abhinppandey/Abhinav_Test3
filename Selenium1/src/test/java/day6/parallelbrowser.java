package day6;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelbrowser {
	@Parameters({"browser"})
	@Test()
	public void Tc1(String b) {
		System.out.println("Browser name:"+b);
		
		
		
	}

}
