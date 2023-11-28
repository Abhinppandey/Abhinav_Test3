package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.Base;

public class MouseHover extends Base {
	@Test
	public void TC1() {
		driver.get("https://www.carwale.com");
		WebElement mousehover = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		Actions Action = new Actions(driver);
		Action.moveToElement(mousehover).perform();
	}

}
