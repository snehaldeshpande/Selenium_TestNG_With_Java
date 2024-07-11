package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdownExapmle extends BaseTest {

	public void DropdownExampleDemo() {
		//Select dropdown value
		Select month = new Select(driver.findElement(By.id("month")));
		driver.findElement(By.id("month")).click();
		//Select By index
		//month.selectByIndex(6);
		//select by value attribute
		//month.selectByValue("9");
		//Select by text
		//month.selectByVisibleText("Dec");
		
		//first selected value
	System.out.println("First selected value ="	+ month.getFirstSelectedOption().getText());
	
List<WebElement> allselectedvalues = month.getAllSelectedOptions();
		for(WebElement elem :  allselectedvalues){
			System.out.println("Element value is = "+elem.getText());
		}
		//all options
		List<WebElement> options = month.getOptions();
		for(WebElement elemn :  options){
			System.out.println("Month values are = "+elemn.getText());
		}
		//Dropdown is multiselect or not
		System.out.println("Is dropdown is multiselect = "+month.isMultiple());
	}
	public static void main(String[] args) {
		dropdownExapmle obj = new dropdownExapmle();
		obj.setupBrowser("chrome", "https://www.facebook.com/reg/");
		obj.DropdownExampleDemo();
		
		

	}

}
