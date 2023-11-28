package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class TestParameterization1 {
	@DataProvider(name = "dp")
	public Object[][] getData() {
		String sheetName = "LoginTest";
		ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\excel\\TestData.xlsx");
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		System.out.println(excel.getCellData(sheetName, 0, 2));
		System.out.println("Total rwos are:" + rowCount + "----" + "Total columns are:" + colCount);
		Object[][] data = new Object[rowCount - 1][colCount];
		for (int rows = 2; rows <= rowCount; rows++) 
		{

			for (int cols = 0; cols < colCount; cols++) {
				data[rows-2][cols]=excel.getCellData(sheetName, cols, rows);
				
				
			}

		}
		return data;

	}

	@Test(dataProvider = "dp")
	public void doLogin(String username, String password) {
		System.out.println(username);
		System.out.println(password);

	}

}
