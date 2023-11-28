package Day3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Base;

public class Tabs extends Base{
	@Test
	public void TC1() {
		driver.get("https://sso.teachable.com/secure/673/identity/sign_up/email");
		
		Set<String> winid=driver.getWindowHandles();
		Iterator<String> iterate= winid.iterator();
		String First_Window=iterate.next();
		
		//1st window
		driver.findElement(By.xpath("(//a[text()='Privacy Policy'])[1]")).click();
		
		winid=driver.getWindowHandles();
		iterate= winid.iterator();
		String Second_Window=iterate.next();
		
		driver.switchTo().window(iterate.next());
		
		
		
		
	}

}
