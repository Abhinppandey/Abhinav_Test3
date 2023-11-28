package day4;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base.Base;

public class Screenshot extends Base{
	
	@Test
	public void Tc1() throws Exception {
		
		Date d=new Date();
		String FileName=d.toString().replace(" ", "_").replace(":", "_")+".png";
		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File("./Screenshot/ "+FileName));
	}

}
