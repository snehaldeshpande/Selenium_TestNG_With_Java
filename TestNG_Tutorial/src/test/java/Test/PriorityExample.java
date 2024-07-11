package Test;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority = 1)
	public void tc1(){
		System.out.println("From test case1");
	}
	
	@Test(priority = 3)
	public void tc2(){
		System.out.println("From test case2");
	}
	
	@Test(priority = 2)
	public void tc3(){
		System.out.println("From test case3");
	}
	
	@Test(priority = 1)
	public void tc4(){
		System.out.println("From test case4");
	}
	
	@Test(priority = 3)
	public void tc5(){
		System.out.println("From test case5");
	}
	

}
