package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExamples extends BaseTest {

	public void explicitWaitExamples() {
		WebDriverWait Wait = new WebDriverWait(driver , Duration.ofSeconds(10));
	    WebElement email = Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
	    email.sendKeys("test");
	}
	

	public void fluentWaitExamples() {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
		        .pollingEvery(Duration.ofSeconds(10));
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaitExamples obj = new WaitExamples();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.explicitWaitExamples();
	}

}
