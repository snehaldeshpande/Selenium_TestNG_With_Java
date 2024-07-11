package Basic;
import org.openqa.selenium.By;

public class Locators1 extends BaseTest {
	
	public void NavigationDemo1(){
		//css ==> id attribute
		//$$("*[id= 'email']");
		//css ==> id attribute
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators1 navicmd = new Locators1();
		navicmd.setupBrowser("Chrome","https://profile.w3schools.com/login?redirect_url=https%3A%2F%2Fwww.w3schools.com%2Fhowto%2Fhowto_css_login_form.asp");
		navicmd.NavigationDemo1();
	}

}
