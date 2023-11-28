package day6;

import org.testng.annotations.Test;

public class GroupTestNG {
	@Test(groups = "Smoke")
	public void Tc1() {
		System.out.println("Tc1");

	}

	@Test(groups = "Smoke")
	public void Tc2() {
		System.out.println("Tc2");
	}

	@Test
	public void Tc3() {
		System.out.println("Tc3");
	}

	@Test(groups = "Sanity")
	public void Tc4() {
		System.out.println("Tc4");
	}

}
