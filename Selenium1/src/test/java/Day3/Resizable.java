package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.Base;

public class Resizable extends Base {
	@Test
	public void TC1() {
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		WebElement resizeable = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		Actions Action = new Actions(driver);
		Action.dragAndDropBy(resizeable, 200, 200).perform();
	}

}
