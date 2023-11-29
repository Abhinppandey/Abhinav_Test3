package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class FindDropDowns extends Base {
	@Test
	public void Tc1() {
		driver.get("https://www.wikipedia.org");
		List<WebElement> list = driver.findElements(By.tagName("option"));
		System.out.println("Number of options in dropdown:" + list.size());

		for (WebElement webElement : list) {
			System.out.println("Options in dropdown are:" + webElement.getAttribute("value"));
		}
	}

}
