package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webElementCommands extends BaseTest {
	
	public void webcommandsDemo() {
		WebElement email = driver.findElement(By.id("email"));
		WebElement instalink = driver.findElement(By.partialLinkText("Instagram"));
		WebElement welMsg = driver.findElement(By.xpath("//h2[@class='_8eso']"));
        WebElement loginBtn = driver.findElement(By.tagName("button"));
        WebElement hiddenEle =  driver.findElement(By.name("jazoest"));
       //                                                                                                                                                                                                                                                                                    )
		
		
		//Fetching the details
		String placeholder = email.getAttribute("placeholder");
		System.out.println(placeholder);
		
		//Get tooltip
		System.out.println( instalink.getAttribute("title"));
		
		//getText
		System.out.println(welMsg.getText());
		
		//getTagname
		System.out.println("Email ids tagnem = "+email.getTagName());
		
		//getLocation
		System.out.println("Login button location (point)=" +loginBtn.getLocation());
		System.out.println("Login button location (point x)=" +loginBtn.getLocation().x);
		System.out.println("Login button location (point y)=" +loginBtn.getLocation().y);
		
		//getSize
		System.out.println("Login button size(dimension)" +loginBtn.getSize());
		System.out.println("Login button size(dimension height)" +loginBtn.getSize().height);
		System.out.println("Login button size(dimension width)" +loginBtn.getSize().width);
		
		//getcssvalues
		System.out.println("Font size of login button" +loginBtn.getCssValue("font-size"));
		
		//1.actions
		//clear
		email.clear();
				
		//SendKeys
		email.sendKeys("snehal_k@outlook.com");
		
		//click
		loginBtn.click();
		
		
		//2.status 
		//isDisplayed
		System.out.println("is email field is displayed=" +email.isDisplayed());
		System.out.println("is the hidden element is displayed=" +hiddenEle.isDisplayed());
		
		//isEnabled
		System.out.println("is email field is Enabled=" +email.isEnabled());

		//isSelected
		driver.findElement(By.partialLinkText("Sign Up")).click();
		
		WebElement maleRadioButton = driver.findElement(By.xpath("adf"));
		System.out.println("Before clicking is redio button is selected =" +maleRadioButton.isSelected());
		maleRadioButton.click();
		System.out.println("After clicking is redio button is selected =" +maleRadioButton.isSelected());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		webElementCommands wbcmd = new webElementCommands();
		wbcmd.webcommandsDemo();
		wbcmd.setupBrowser("Chrome","https://www.facebook.com");

	}

}
