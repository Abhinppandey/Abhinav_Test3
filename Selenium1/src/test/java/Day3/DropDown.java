package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.Base;

public class DropDown extends Base {
	@Test
	public void Tc1() {
		driver.get("http://www.tizag.com/htmlT/htmlselect.php");
		WebElement dropdown = driver.findElement(By.name("selectionField"));
		new Select(dropdown).selectByVisibleText("Connecticut -- CN");
	}

}
