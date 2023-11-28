package day4;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class FindLinksfromPage extends Base {

	@Test
	public static void Tc1() {
		driver.get("https://www.wikipedia.org");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("All links on page are:" + list);

		for (WebElement webElement : list) {
			String AllLinks = webElement.getAttribute("href");
			checkBrokenLinks(AllLinks);
		}
	}

	public static void checkBrokenLinks(String LinkURL) {
		try {

			URL url = new URL(LinkURL);
			HttpURLConnection httpurlconnection = (HttpURLConnection) url.openConnection();
			httpurlconnection.setConnectTimeout(3000);
			httpurlconnection.connect();

			if (httpurlconnection.getResponseCode() >= 400) {
				System.out.println(LinkURL + "--->" + httpurlconnection.getResponseMessage() + " Is a broken link");
			}

			else {
				System.out.println(LinkURL + "--->" + httpurlconnection.getResponseMessage());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
