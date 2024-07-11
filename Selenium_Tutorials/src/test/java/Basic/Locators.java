package Basic;

import org.openqa.selenium.By;

public class Locators extends BaseTest {

	public void LocatorDemo() {
		//id
		driver.findElement(By.name("email")).sendKeys("snehal_k@outlook.com");
	    //name
		driver.findElement(By.name("password")).sendKeys("password");
		//class
		driver.findElement(By.className("LoginForm"));
		//Tagname
		driver.findElement(By.tagName("button")).click();
		//linkText
		driver.findElement(By.linkText("Sign up")).click();
		//partial linktext
		driver.findElement(By.partialLinkText("Sign")).click();
		//xpath
		//tagname[@attribute = "value"]
		
		//css selector
		//driver.findElement(By.cssSelector("#LoginPanel")).click();
		
		//Absolute xpath
		String abspath = "/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[5]/div/form/div[1]/input[1]";
		driver.findElement(By.xpath("abspath")).click();
		
		//Relative path starts with //
		driver.findElement(By.xpath("//div/div[2]/div/div[5]/div/form/div[1]/input")).click();
		
		//tagname
		driver.findElement(By.xpath("//*[@id='']")).click();
		
		//tagname + attribute
		//("//input[@id='email']")
		//("//input[@name='email']")
		//("//input[@class='email']")
		//("//input[@type='text']")
		//("//input[@data_testId='royal']")
		//("//input[@placeholder='phone number']")
		//("//input[@area_lable='text']")
		//("//input[@autofocus ='1']")
		
		//functions
		//starts with
		//Sx("//input[starts-with(@id,'email')]")
		//Contains
		//("//input[contains(@id,'em')]")
		//("//h2[text()='Selenium']")
	    //("//button[text()='Login']")
		//("//button[starts-with(text(),'Log in')]")
	    //("//button[contains(text(),'Log in')]")
		
		//Advanced Xpath functions
		//("//input[@id='email' and @name='email'])
		//("//input[@id='email' or @name='email']")
		 //("//button[text()='Login' or text()='Sign up' ]")
		
		//index -> try to avoid this
		//when elements are not under same parent => index is defined outside the expression,it starts from 0 
		//$x("//input")[2]
		//when elements are under the same parent => index is inside the expression and it starts from 1
		//$x("//select[2]")
		//$x("//span/select[2]")
	}

public static void main(String[] args) {
	
	Locators loc = new Locators();
	loc.setupBrowser("Chrome","https://profile.w3schools.com/login?redirect_url=https%3A%2F%2Fwww.w3schools.com%2Fhowto%2Fhowto_css_login_form.asp");
	loc.LocatorDemo();
}
}
