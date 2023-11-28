package day1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Base;

public class TabsAndPopups extends Base {

	@Test
	public static void Tc1() throws Exception {
		driver.get("https://sso.teachable.com/secure/673/identity/sign_up/email");

		Set<String> winids = driver.getWindowHandles();
		Iterator<String> itrate = winids.iterator();
		String First_window = itrate.next();// 1st window

		// 1st window
		driver.findElement(By.xpath("(//a[text()='Privacy Policy'])[1]")).click();

		winids = driver.getWindowHandles();
		itrate = winids.iterator();
		String Second_window = itrate.next();// 2nd window
		System.out.println("---2st window:" + Second_window);

		// 2nd Window
		driver.switchTo().window(itrate.next());
		driver.findElement(By.xpath("//a[@id='header-sign-up-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("user_name")).sendKeys("abhinpandey");

	}

}
