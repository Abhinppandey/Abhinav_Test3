package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class Brokenlinks extends Base {
	@Test
	public static void TC1() {
		driver.get("http://amazon.in");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on page are:" + list.size());
		for (WebElement webElement : list) {
			System.out.println("links on page are" + webElement.getAttribute("href"));

		}

	}

}
