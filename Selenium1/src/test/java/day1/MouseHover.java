package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.Base;

public class MouseHover extends Base {

	@Test
	public void Tc1() {
		driver.get("https://www.carwale.com");
		WebElement mouseHover = driver.findElement(By.xpath("//li[@class=' nS6XVS']/div"));
		Actions Action = new Actions(driver);
		Action.moveToElement(mouseHover).perform();

	}

}
