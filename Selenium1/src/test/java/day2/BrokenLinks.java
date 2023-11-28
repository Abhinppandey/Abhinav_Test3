package day2;

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
		driver.get("http://amazon.in");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("total links are:" + list.size());
		for (WebElement webElement : list) {
			String Alllinks = webElement.getAttribute("href");

			CheckBrokenLinks(Alllinks);

		}

	}

	public static void CheckBrokenLinks(String LinkURL) {
		try {

			URL url = new URL(LinkURL);
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setConnectTimeout(3000);
			httpURLConnection.connect();
			if (httpURLConnection.getResponseCode() >= 400) {
				System.out.println(LinkURL + "--->" + httpURLConnection.getResponseMessage() + "Link is broken");
			} else {
				System.out.println(LinkURL + "--->" + httpURLConnection.getResponseMessage());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
