package day8;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class BrokenLinks extends Base {

	@Test
	public void TC1() {
		driver.get("https://www.wikipedia.org");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on page are:" + list.size());
		for (WebElement webElement : list) {
			String AllLinks = webElement.getAttribute("href");
			CheckBrokenLinks(AllLinks);

		}

	}

	public static void CheckBrokenLinks(String LinkURL) {

		try {

			URL url = new URL(LinkURL);
			HttpURLConnection httpurlconnection = (HttpURLConnection) url.openConnection();
			httpurlconnection.setConnectTimeout(5000);
			httpurlconnection.connect();
			if (httpurlconnection.getResponseCode() >= 400) {
				System.out.println(LinkURL + "--->" + httpurlconnection.getResponseMessage() + "is a broken link");

			} else {
				System.out.println(LinkURL + "--->" + httpurlconnection.getResponseMessage());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
