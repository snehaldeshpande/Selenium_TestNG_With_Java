package Test;

import org.testng.annotations.Test;

public class TestAnnotationDemo {
	
	@Test(description ="Test case to validate create user functionality" )
	public void CreateUser() {
		System.out.println("User created successfully");
	}

}
