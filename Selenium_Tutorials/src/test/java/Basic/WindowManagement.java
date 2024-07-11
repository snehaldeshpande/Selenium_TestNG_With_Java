package Basic;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class WindowManagement extends BaseTest {

	public void windowDemo() {
		//Window management commands
		driver.getWindowHandle(); //current window/ tab id
        driver.getWindowHandles();// set of window  tab ids open by parent driver instance
        driver.switchTo().window("<window-id>"); // you can swith control from one window to other
	    driver.close();
	    driver.quit();
	    
	    System.out.println("Page title=" +driver.getTitle());
	    System.out.println("Window id=" +driver.getWindowHandle());
	    System.out.println("Total window handles=" +driver.getWindowHandles());
	    
	    System.out.println("************************");
	    driver.findElement(By.partialLinkText("Instagram")).click();
	    
	   System.out.println("Page title=" +driver.getTitle());
	    System.out.println("Page title=" +driver.getTitle());
	    System.out.println("Window id=" +driver.getWindowHandle());
	    System.out.println("Total window handles=" +driver.getWindowHandles());
	    System.out.println("************************");
	    System.out.println("Shifting control to instgram page");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    try{
	    Thread.sleep(3000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    	
	    	driver.close();
	    }
	    
	    System.out.println("Page title=" +driver.getTitle());
	    System.out.println("Page title=" +driver.getTitle());
	    System.out.println("Window id=" +driver.getWindowHandle());
	    System.out.println("Total window handles=" +driver.getWindowHandles());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowManagement obj = new WindowManagement();
		obj.setupBrowser("chrome", "https://www.facebook.com");
        obj.windowDemo();
	}

}
