package day5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Para {
	@DataProvider(name = "dp")
	public Object[][] getData() {
		Object[][] data = new Object[3][2];

		data[0][0] = "Abhinav1";
		data[0][1] = "password1";

		data[1][0] = "Abhinav1";
		data[1][1] = "password1";

		data[2][0] = "Abhinav1";
		data[2][1] = "password1";

		return data;
	}

	@Test(dataProvider = "dp")
	public void Tc1(String UserName, String password) {
		System.out.println(UserName + "--->" + password);
	}
}
