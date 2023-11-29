package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class FindLinks extends Base {

	@Test
	public void TC1() {

		driver.get("http://amazon.in");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on page are:" + list.size());
		for (WebElement webElement : list) {
			System.out.println("Links on page are: "+webElement.getAttribute("href"));
		}

	}

}
