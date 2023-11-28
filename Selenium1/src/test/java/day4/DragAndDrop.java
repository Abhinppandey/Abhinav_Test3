package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.Base;

public class DragAndDrop extends Base {

	@Test
	public void Tc1() {
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));

		Actions Action = new Actions(driver);
		Action.dragAndDrop(draggable, droppable).perform();
	}

}
