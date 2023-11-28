package day2;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Base;

public class FindLinksFromPage extends Base {
	public static void Tc1() {
		driver.get("https://www.wikipedia.org");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("All links on page are:" + list.size());
		for (WebElement webElement : list) {
			String AllLinks = webElement.getAttribute("href");
			CheckBrokenLinks(AllLinks);

		}
	}

	public static void CheckBrokenLinks(String LinkURL) {
		try {
			URL url = new URL(LinkURL);
			HttpURLConnection httpurlConnection = (HttpURLConnection) url.openConnection();
			httpurlConnection.setConnectTimeout(3000);
			httpurlConnection.connect();

			if (httpurlConnection.getResponseCode() >= 400) {
				System.out.println(LinkURL + "--->" + httpurlConnection.getResponseMessage() + "Link is broken");

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
