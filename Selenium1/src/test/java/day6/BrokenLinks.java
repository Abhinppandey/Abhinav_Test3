package day6;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class BrokenLinks extends Base {
	@Test
	public static  void Tc1() {

		driver.get("http://amazon.in");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(" Number of links on page are:" + list.size());

		for (WebElement webElement : list) {
			String AllLinks = webElement.getAttribute("href");
//			System.out.println(AllLinks);
			checkBrokenlinks(AllLinks);
		}
	}

	public static void checkBrokenlinks(String urlLink) {
		try {
			URL url = new URL(urlLink);
			HttpURLConnection httpurlconnection = (HttpURLConnection) url.openConnection();

			httpurlconnection.setConnectTimeout(200);
			httpurlconnection.connect();
			if (httpurlconnection.getResponseCode() >= 400) {
				System.out.println(urlLink + "-->" + httpurlconnection.getResponseMessage() + "Link  is broken");

			} else {
				System.out.println(urlLink + "-->" + httpurlconnection.getResponseMessage());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
