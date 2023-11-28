package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class FindLinksFromPage extends Base {

	@Test
	public void Tc1() {
		driver.get("https://www.wikipedia.org");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on page are :" + list.size());
		System.out.println("All links are:");
		for (WebElement webElement : list) {
			System.out.println(webElement.getAttribute("href"));
}
		
		System.out.println("---------------------------------------------------");
		WebElement Block=driver.findElement(By.xpath("//div[@class='footer']/div[3]"));
		List<WebElement> list1 = Block.findElements(By.tagName("a"));
		System.out.println("Number of links on block are :" + list1.size());
		System.out.println("All Block are:");
		for (WebElement webElement : list1) {
			System.out.println(webElement.getAttribute("href"));
		
		
	}

	}}
