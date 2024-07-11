package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollExample extends BaseTest {
	
	public void youtube() {
		setupBrowser("chrome","https://www.youtube.com/results?search_query=iphone");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,3000)");
	}
	public void github() {
		//If user want to scroll till bottom
		setupBrowser("chrome","https://github.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 
	}

	public void amazon() {
		//If user want to scroll till bottom
	   setupBrowser("chrome","https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=10302023756001391847&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061993&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
	    WebElement techdetails = driver.findElement(By.xpath("//h2[text()='Technical Details']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();", techdetails);
	}
	
	public static void main(String[] args) {
		ScrollExample obj = new ScrollExample();
		obj.youtube();
		obj.github();
       obj.amazon();
	}

}
