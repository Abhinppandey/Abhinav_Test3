package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class FindLinksFromDropdown extends Base {

	@Test
	public void Tc1() {
		driver.get("https://www.wikipedia.org");
//		driver.findElement(By.id("searchLanguage"));
		List<WebElement> list = driver.findElements(By.tagName("option"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			
		}
	}

}
