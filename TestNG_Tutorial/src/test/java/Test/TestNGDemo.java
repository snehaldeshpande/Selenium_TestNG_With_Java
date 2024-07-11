package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@BeforeMethod
	public void before() {
		System.out.println("Test before executed");
	}

	@AfterMethod
	public void after() {
		System.out.println("Test after executed");
	}

	@Test
	public void tc1() {
		System.out.println("Test case1 executed");
	}
	
	@Test
	public void tc2() {
		System.out.println("Test case2 executed");
	}
}
