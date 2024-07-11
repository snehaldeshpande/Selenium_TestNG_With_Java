package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemoExample extends BaseTest {

	public void mousehoverDemo() {
		setupBrowser("chrome", "https://www.amazon.in/");
		WebElement navIcon = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		Actions act = new Actions(driver);
		act.moveToElement(navIcon).build().perform();
		
		driver.findElement(By.partialLinkText("Create a Wish List")).click();
	}
	
	public void dragDropDemo() {
		setupBrowser("chrome", "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    WebElement oslo = driver.findElement(By.id("box1"));
	    WebElement norway = driver.findElement(By.id("box101"));
	    
	   Actions act = new Actions(driver);
	   act.dragAndDrop(oslo, norway).build().perform();
	}
	
	public static void main(String[] args) {
		ActionsDemoExample obj = new ActionsDemoExample();
		//obj.mousehoverDemo();
		obj.dragDropDemo();

	}

}
