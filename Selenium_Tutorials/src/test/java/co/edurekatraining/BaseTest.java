package co.edurekatraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	WebDriver driver;
	
	public void setupBrowser(String browser , String url){
		// To launch browser
		 
		
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
