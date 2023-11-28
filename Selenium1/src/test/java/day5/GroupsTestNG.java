package day5;

import org.testng.annotations.Test;

import Base.Base;

public class GroupsTestNG extends Base {

	@Test(groups = "High")
	public void Tc1() {
		System.out.println("This is High1");
	}

	@Test(groups = "Low")
	public void Tc2() {
		System.out.println("This is low");
	}

	@Test(groups = "High")
	public void Tc3() {
		System.out.println("This is High3");
	}

	@Test(groups = "High")
	public void Tc4() {
		System.out.println("This is High4");
	}

}
