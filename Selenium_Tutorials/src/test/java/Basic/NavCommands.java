package Basic;

public class NavCommands extends BaseTest {

	public void navCommandsDemo() throws InterruptedException {
		
		
		Thread.sleep(5000);
		System.out.println("Navigating to youtube page");
		driver.navigate().to("https://www.youtube.com");
		//back
		Thread.sleep(5000);
		System.out.println("Navigating back to google page");
		driver.navigate().back();
		//forward
		Thread.sleep(5000);
		System.out.println("Forwarding to youtube page");
		driver.navigate().forward();
		//Refresh
		Thread.sleep(5000);
		System.out.println("Refresh youtube page");
		driver.navigate().refresh();
		
		driver.close();
		
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		NavCommands nvcmd = new NavCommands();
		nvcmd.setupBrowser("Chrome","https://www.google.com");
		try {
			nvcmd.navCommandsDemo();
		}catch( InterruptedException e){
			e.printStackTrace();
		}

	}

}
