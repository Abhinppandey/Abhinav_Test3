package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class FindLinksFromDropdown extends Base {

	@Test
	public void Tc1() {
		driver.get("https://www.wikipedia.org/");
//		List<WebElement> list = driver.findElements(By.tagName("option"));
//		System.out.println("number of dropdowns are:" + list.size());
//		for (WebElement webElement : list) {
//			System.out.println(webElement.getText());
		
		List<WebElement> list=driver.findElements(By.tagName("options"));
		System.out.println("Number of element in dropdown:"+list.size());
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		}
	

}
