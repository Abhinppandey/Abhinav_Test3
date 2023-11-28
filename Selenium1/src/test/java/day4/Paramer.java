package day4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.Base;

public class Paramer  {

	@DataProvider(name = "dp")
	public Object[][] getData() {

		Object data[][] = new Object[3][2];
		data[0][0] = "Abhinav1";
		data[0][1] = "Password1";

		data[1][0] = "Abhinav2";
		data[1][1] = "Password2";

		data[2][0] = "Abhinav3";
		data[2][1] = "Password3";

		return data;
	}

	@Test(dataProvider = "dp")
	public void Tc1(String username,String password) {
		System.out.println(username+"--->"+password);

	}

}
