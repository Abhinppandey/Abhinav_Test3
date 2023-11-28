package day4;

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
		System.out.println("Number of links on page are:" + list.size());
		for (WebElement webElement : list) {
			String links = webElement.getAttribute("href");
			checkBrokenLinkls(links);
		}
	}

	public static void checkBrokenLinkls(String listURL) {
		
		try {
			
			URL url=new URL(listURL);
			HttpURLConnection httpurlconnection=(HttpURLConnection) url.openConnection();
			httpurlconnection.setConnectTimeout(3000);
			httpurlconnection.connect();
			
			if(httpurlconnection.getResponseCode()>=400) {
				System.out.println(listURL+"--->"+httpurlconnection.getResponseMessage()+"link is broken");
			}
			else {
				System.out.println(listURL+"--->"+httpurlconnection.getResponseMessage());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
