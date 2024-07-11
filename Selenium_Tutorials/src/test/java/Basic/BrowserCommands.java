package Basic;

public class BrowserCommands extends BaseTest {
	
	public void browserCommandsDemo() {
		//open url
		driver.get("https://www.youtube.com");
		
		//get current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//laymans way of writing tc
		String expectedurl = "https://www.facebook.com/";
		String actualurl = driver.getCurrentUrl();
		if(actualurl.equals(expectedurl))
			System.out.println("url test case : passed");
		else
			System.out.println("url test case : failed");
		
		//get tiltle
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BrowserCommands obj = new  BrowserCommands();
		 obj.browserCommandsDemo();
		 obj.setupBrowser("Chrome","https://www.w3schools.com");

	}

}
