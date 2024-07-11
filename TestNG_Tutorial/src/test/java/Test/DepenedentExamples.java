package Test;

import org.testng.annotations.Test;

public class DepenedentExamples {

	//dependency flow is not available so priority option will not work
	//priority is about functional impact priority not about sequence
	@Test
	public void createUser() {
		System.out.println("User created successfuly");
	}
	

	@Test(dependsOnMethods = {"createUser"})
	public void updateUser() {
		System.out.println("User updated successfuly");
	}

	@Test(dependsOnMethods = {"createUser","updateUser"})
	public void deleteUser() {
		System.out.println("User deleted successfuly");
	}
}
