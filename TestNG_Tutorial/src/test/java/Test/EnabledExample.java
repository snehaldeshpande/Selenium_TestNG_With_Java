package Test;

import org.testng.annotations.Test;

public class EnabledExample {
	
	@Test(enabled = true)
	public void tc1() {
		System.out.println("From test case1");
	}
	
	//TC2 will not get executed -- it will be skipped
	@Test(enabled = false)
	public void tc2() {
		System.out.println("From test case2");
	}


}
