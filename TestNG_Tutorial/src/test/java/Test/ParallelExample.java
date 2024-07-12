package Test;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExample {

	@Parameters({"browser"})
	@Test
	public void TC1(String browser) {
		Reporter.log("browser =" + browser);
	}
}
