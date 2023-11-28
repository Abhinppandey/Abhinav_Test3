package day5;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class FindLinksFromPage extends Base {
	@Test
	public static void Tc1() {
		driver.get("https://www.wikipedia.org");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links on page are:" + list);

		for (WebElement webElement : list) {
			String allLinks = webElement.getAttribute("href");
			checkBrokenLinks(allLinks);
		}
	}

	public static void checkBrokenLinks(String linkURL) {

		try {
			URL url = new URL(linkURL);
			HttpURLConnection httpurlconnection = (HttpURLConnection) url.openConnection();
			httpurlconnection.setConnectTimeout(300);
			httpurlconnection.connect();

			if (httpurlconnection.getResponseCode() >= 400) {
				System.out.println(linkURL + "-->" + httpurlconnection.getResponseMessage() + " link is broken");
			} else {
				System.out.println(linkURL + "-->" + httpurlconnection.getResponseMessage());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
