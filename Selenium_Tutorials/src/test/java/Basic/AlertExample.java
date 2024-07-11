package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertExample extends BaseTest {

	public void alertDemo() {
		WebElement promptAlertBtn = driver.findElement(By.xpath("//button[contains(text(),'prompt)]"));
		promptAlertBtn.click();
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		
		//ok , submit or accept button
		driver.switchTo().alert().accept();
		
		//cancel ,close , esc button
		driver.switchTo().alert().dismiss();
		
		//type something -- from chrome 84 feature is not suported -- firefox will work
		driver.switchTo().alert().sendKeys("Test");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertExample obj = new AlertExample();
		obj.setupBrowser("chrome","https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		obj.alertDemo();
	}

}
