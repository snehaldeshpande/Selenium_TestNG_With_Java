package co.edurekatraining;

import org.openqa.selenium.By;


public class Assignment4 extends BaseTest {
	
	public void assDemo() {
		 System.out.println("Welcome");
		 driver.findElement(By.className("signin")).click();
		 driver.findElement(By.className("signinbtn")).click();
		 driver.switchTo().alert().accept();
		 driver.get("https://demoqa.com/browser-windows");
		 driver.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4 ass = new Assignment4();
		ass.setupBrowser("Chrome","https://www.rediff.com/");
		ass.assDemo();
		
	
	}

}
