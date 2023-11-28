package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.Base;

public class RightClick extends Base {
	@Test
	public void TC1() {
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		WebElement rightClick = driver.findElement(By.xpath("(//p[@align='center'])[2]/img"));
		Actions Action = new Actions(driver);
		Action.contextClick(rightClick).perform();

	}

}
