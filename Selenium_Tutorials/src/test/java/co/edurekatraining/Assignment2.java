package co.edurekatraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment2 extends BaseTest {
	
public void locatorsDemo() {
	
 System.out.println("Welcome");

//Money icon
 driver.findElement(By.className("moneyicon")).getClass();
 driver.findElement(By.xpath("//a[@class ='moneyicon']")).getClass();

 
 //input tabs
 driver.findElement(By.cssSelector("//a[@class='signin']")).click();
 driver.findElement(By.xpath("//input[@id ='login1']")).getClass();
 driver.findElement(By.xpath("//a[@name ='passwd']")).getClass();
 
 //all links
 driver.findElement(By.xpath("//a[@class ='F12']")).getClass();
 driver.findElement(By.xpath("//a[@class ='mailicon']")).getClass(); 
 driver.findElement(By.xpath("//a[@class ='eproicon']")).getClass(); 
 driver.findElement(By.xpath("//a[@class ='shopicon']")).getClass(); 
 driver.findElement(By.xpath("//a[@class ='guruicon']")).getClass(); 
 
 
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 ass = new Assignment2();
		ass.setupBrowser("Chrome","https://www.rediff.com/");
		ass.locatorsDemo();
	}

	public void ass4Demo() {
		// TODO Auto-generated method stub
		
	}

}
