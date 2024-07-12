package Test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

	@Test
	public void TC1() {
		SoftAssert sa = new SoftAssert();
		int a = 5;
		Reporter.log("a = " +a);
		assertTrue(a<= 10,"The value of a greater than10");
		System.out.println("Done from Test case1");
		sa.assertAll();
	}
	@Test
	public void TC2() {

		System.out.println("Done from Test case2");
	}
}

