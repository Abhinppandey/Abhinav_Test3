package day5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Base;

public class TabsAndPopup extends Base {
	@Test
	public void Tc1() throws Exception {

		driver.get("https://sso.teachable.com/secure/673/identity/sign_up/email");
//		Set<String> winids = driver.getWindowHandles();
//		Iterator<String> iterate = winids.iterator();
//		String First_Window = iterate.next();// 1st window

		Set<String> winids= driver.getWindowHandles();
		Iterator<String> iterate= winids.iterator();
		String FirstWinow=iterate.next();
		
		driver.findElement(By.xpath("(//a[text()='Privacy Policy'])[1]")).click();

		
		winids = driver.getWindowHandles();
		iterate = winids.iterator();
		String Second_Window = iterate.next();// Second Window

		Thread.sleep(2000);
		driver.switchTo().window(iterate.next());
		driver.findElement(By.id("header-sign-up-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Abhi");

	}
}
