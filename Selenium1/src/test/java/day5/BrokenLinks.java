package day5;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class BrokenLinks extends Base {
	@Test
	public static void Tc1() {
		driver.get("https://amazon.in");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("total number of links are:" + list.size());
		for (WebElement webElement : list) {
			String AllLinks = webElement.getAttribute("href");
			brokenLinks(AllLinks);

		}
	}

	public static void brokenLinks(String linkURL) {
		try {
			URL url = new URL(linkURL);

			HttpURLConnection httpurlconnection = (HttpURLConnection) url.openConnection();
			httpurlconnection.setConnectTimeout(3000);
			httpurlconnection.connect();

			if (httpurlconnection.getResponseCode() >= 400) {
				System.out.println(linkURL + "-->" + httpurlconnection.getResponseMessage() + " Link is broken");

			} else {
				System.out.println(linkURL + "-->" + httpurlconnection.getResponseMessage());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
