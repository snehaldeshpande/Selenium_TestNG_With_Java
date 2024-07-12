package Test;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Standard data serealization format
public class ParameterExample {
	
	@Parameters({"validUsername","validPassword"})
	@Test
	public void validLogin(String username, String password) {
		Reporter.log("username = " +username);
	    Reporter.log("password = "+password);
	}

	@Parameters({"invalidUsername","invalidPassword"})
	@Test
	public void invalidLogin(String username, String password) {
		Reporter.log("username = " +username);
	    Reporter.log("password = "+password);
	}
}
