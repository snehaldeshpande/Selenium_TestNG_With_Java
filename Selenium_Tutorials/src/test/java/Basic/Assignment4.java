package Basic;

public class Assignment4  extends BaseTest {
	
	public void TC1() {
		
		System.out.println("Page Title :"+driver.getTitle());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();
		obj.setupBrowser("Chrome","https://www.w3schools.com");
		obj.TC1();
	}
		
}
