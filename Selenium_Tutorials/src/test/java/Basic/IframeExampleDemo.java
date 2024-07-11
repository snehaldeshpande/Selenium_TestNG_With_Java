package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframeExampleDemo extends BaseTest {
	
	public void iframeDemo() {
		//index
		driver.switchTo().frame(0);
		
		//id or name 
		driver.switchTo().frame("menubtn_container");
		
		//webelement
		WebElement elemiframe = driver.findElement(By.xpath("//a[@title='Java Tutorial']"));
		driver.switchTo().frame("elemiframe");
		
		//Naviagte back to basepage
		driver.switchTo().defaultContent();
		
		//Navigate to parentframe
		driver.switchTo().parentFrame();
		
		
	WebElement elem = driver.findElement(By.xpath("//a[@title='Java Tutorial']"));
	System.out.println("text" +elem.getClass());
	}

	public static void main(String[] args) {
		IframeExampleDemo obj = new IframeExampleDemo();
		obj.setupBrowser("chrome", "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
	}

}
