package day5;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Base;

public class Frame extends Base {
	@Test
	public void TC1() {
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("runbtn")).click();
	}

}
