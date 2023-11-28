package day1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base.Base;

public class Screenshot extends Base {
	@Test
	public void TC1() throws IOException {
		driver.get("http://amazon.in");
		Screenshot();

	}

	public void Screenshot() throws IOException {
//		Date d = new Date();
//		String fileName = d.toString().replace(" ", "_").replace(":", "_") + ".jpg";
//		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(Screenshot, new File("./Screenshot/" + fileName));

		Date d = new Date();
		String fileName = d.toString().replace(" ", "_").replace(":", "_") + ".jpg";
		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File("./Screenshot/" + fileName));

	}

}
