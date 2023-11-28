package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class FindLinskFromPage extends Base {
	@Test
	public void Tc1() {
		driver.get("https://www.wikipedia.org");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getAttribute("href"));
		}
	}

}
