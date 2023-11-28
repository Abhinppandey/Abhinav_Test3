package day6;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Base;

public class tabs extends Base {
	@Test
	public void Tc1() throws Exception {

		driver.get("https://sso.teachable.com/secure/673/identity/sign_up/email");
		Set<String> winid = driver.getWindowHandles();
		Iterator<String> iterate = winid.iterator();
		iterate.next();

		driver.findElement(By.xpath("(//a[text()='Privacy Policy'])[1]")).click();
		winid = driver.getWindowHandles();
		iterate = winid.iterator();
		iterate.next();
		Thread.sleep(2000);
		
		driver.switchTo().window(iterate.next());

		driver.findElement(By.id("header-sign-up-btn")).click();
		driver.findElement(By.id("user_name")).sendKeys("Abhi");

	}

}
