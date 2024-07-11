package Test;

import org.testng.annotations.Test;

public class GroupExapmle {
	
	@Test(groups = "Regression")
	public void tc1() {
		System.out.println("From test case 1");
	}
	
	@Test(groups = "Regression")
	public void tc2() {
		System.out.println("From test case 2");
	}
	
	@Test(groups = {"Regression","Smoke"})
	public void tc3() {
		System.out.println("From test case 3");
	}
	
	@Test(groups = "Regression")
	public void tc4() {
		System.out.println("From test case 4");
	}
	
	@Test(groups = {"Regression", "Smoke"})
	public void tc5() {
		System.out.println("From test case 5");
	}





}
