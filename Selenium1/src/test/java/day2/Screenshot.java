package day2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import bsh.util.Util;

public class Screenshot {
	public static WebDriver driver;

	@Test
	public static  void Tc1() throws Exception {
		driver=new ChromeDriver();
		driver.get("http://amazon.com");
		Date d=new Date();
		String FileName=d.toString().replace(" ", "_").replace(":", "_")+".png";
		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot,new File( "./Screenshot/"+FileName));
		
		
	}

}
