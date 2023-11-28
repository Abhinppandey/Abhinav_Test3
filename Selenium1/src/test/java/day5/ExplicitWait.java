package day5;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.Base;

public class ExplicitWait extends Base{
	@Test
	public void Tc1() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
//		wait.until(ExpectedConditions.elementToBeClickable(null))
	}

}
