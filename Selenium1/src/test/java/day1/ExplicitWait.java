package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.Base;

public class ExplicitWait extends Base {

	@Test
	public static  void Tc1() {

		driver.get("http://gmail.com");
		String title = driver.getTitle();
		String expectedTitle = "htt://gmail.com";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement UserName = driver.findElement(By.id("identifierId"));
		UserName.sendKeys("abhinpandey2222@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("Techap#2");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("password"))).sendKeys("Texhap#2");
		
		

	}

}
