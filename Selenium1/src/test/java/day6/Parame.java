package day6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.Base;

public class Parame {
	@DataProvider(name = "dp")
	public Object[][] getData() {

		Object[][] data = new Object[3][2];

		data[0][0] = "Abhinav";
		data[0][1] = "Password1";

		data[1][0] = "Abhinav";
		data[1][1] = "Password1";

		data[2][0] = "Abhinav";
		data[2][1] = "Password1";
		return data;

	}

	@Test(dataProvider = "dp")
	public void Tc1(String Username, String password) {
		System.out.println(Username + "-->" + password);
	}
}
