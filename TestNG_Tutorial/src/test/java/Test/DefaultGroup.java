package Test;

import org.testng.annotations.Test;

@Test(groups= {"Regression"})//default grouping
public class DefaultGroup {
	
	@Test
	public void tc1() {
		System.out.println("From test case 1");
	}
	
	@Test(groups = {"Bug"})
	public void tc2() {
		System.out.println("From test case 2");
	}
	
	@Test(groups = {"Smoke"})
	public void tc3() {
		System.out.println("From test case 3");
	}
	
	@Test
	public void tc4() {
		System.out.println("From test case 4");
	}
	
	@Test
	public void tc5() {
		System.out.println("From test case 5");
	}



}
