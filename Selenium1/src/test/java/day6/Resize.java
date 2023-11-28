package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.Base;

public class Resize extends Base {
	@Test
	public void Tc1() {
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		Actions Action = new Actions(driver);
		Action.dragAndDropBy(resize, 200, 200).perform();

	}

}
