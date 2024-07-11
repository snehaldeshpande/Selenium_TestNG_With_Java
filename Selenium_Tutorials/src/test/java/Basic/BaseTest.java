package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	WebDriver driver;
	
	public void setupBrowser(String browser , String url){
		// To launch browser
		 
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//page load timeout => POM
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		//script load timeout ==> setup browser method
		//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		
			if(browser.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver(); 
			}
			else if(browser.equalsIgnoreCase("Firefox")){
				driver = new FirefoxDriver(); 
			}
			else if(browser.equalsIgnoreCase("Edge")){
				driver = new EdgeDriver(); 
			}
			else {
				System.out.println("Valid browser is not given so quiting the test");
			}
		
			driver.get(url);
			
	}
	
	public void quitBrowser() {
		driver.quit();
	}



	public static void main(String[] args) {
		BaseTest obj = new BaseTest();
		obj.setupBrowser("Chrome","https://www.w3schools.com");
		obj.quitBrowser();
		
}
}
