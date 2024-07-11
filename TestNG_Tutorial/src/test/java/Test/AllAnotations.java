package Test;

import org.testng.annotations.Test;

public class AllAnotations {

	@Test
	public void tc1() {
		System.out.println("Test case1 executed");
	}

	@Test
	public void tc2() {
		System.out.println("Test case2 executed");
	}

	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
    System.out.println("Before Method");
	}

	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}

	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");
	}

	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("After class");
	}

	@org.testng.annotations.BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test");
	}

	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}

	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite");
	}

	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println("After suite");
	}

}
