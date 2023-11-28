package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.Base;

public class RightClick extends Base {
	@Test
	public void Tc1() {

		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		WebElement rightclick = driver.findElement(By.xpath("(//p[@align='center'])[2]/img"));
		Actions Action = new Actions(driver);
		Action.contextClick(rightclick).perform();
	}

}
