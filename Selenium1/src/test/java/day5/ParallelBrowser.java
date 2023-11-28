package day5;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParallelBrowser {
	
	@Parameters({"browser"})
	@Test
	public void doLogin(String b) throws Exception {
		System.out.println("browser name:"+b);
		Thread.sleep(2000);
		
	}
}
