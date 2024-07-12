package Test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertExample {

	@Test
	public void TC1() {
		int a = 50;
		Reporter.log("a = " +a);
		assertTrue(a<= 10,"The value of a greater than10");
		System.out.println("Done from Test case1");
	}
	@Test
	public void TC2() {

		System.out.println("Done from Test case2");
	}
}
