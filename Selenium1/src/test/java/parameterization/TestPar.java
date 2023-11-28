package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPar {
	@DataProvider(name = "dp")
	public Object[][] getData() {

		Object[][] data = new Object[3][2];

		data[0][0] = "Abhinav1";
		data[0][1] = "password1";

		data[1][0] = "Abhinav2";
		data[1][1] = "password2";

		data[2][0] = "Abhinav3";
		data[2][1] = "password3";

		return data;
	}
	
	@Test(dataProvider = "dp")
	public void Tc1(String username,String password) {
		System.out.println(username+"---"+password);
	}

}
