package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class FindLinksFromDropdwon extends Base {
	@Test
	public void TC1() {
		driver.get("https://www.wikipedia.org");
		List<WebElement> list = driver.findElements(By.tagName("option"));
		System.out.println("Number of links on page are:" + list.size());

		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
	}

}
