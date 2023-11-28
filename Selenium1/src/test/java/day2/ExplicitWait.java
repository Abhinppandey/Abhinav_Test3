package day2;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.Base;

public class ExplicitWait extends Base{
	public static WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
	@Test
	public void Tc() {
		wait.until(ExpectedConditions.presenceOfElementLocated(null));
		
		
		
	}

}
