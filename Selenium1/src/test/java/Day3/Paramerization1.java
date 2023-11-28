package Day3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Paramerization1 {

	@DataProvider(name="dp")
	public Object[][] gatData(){
		Object[][] data=new Object[3][2];
		data[0][0]="Abhinav1";
		data[0][1]="Password1";
		
		data[1][0]="Abhinav2";
		data[1][1]="Password2";
		
		data[2][0]="Abhinav3";
		data[2][1]="Password3";
		
		
		
		return data;
	}
	
	@Test(dataProvider = "dp")
	public void Tc1(String username,String Password) {
		System.out.println(username+"---"+Password);
		
	}
}
