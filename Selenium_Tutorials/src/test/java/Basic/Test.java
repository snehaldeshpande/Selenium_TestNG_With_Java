package Basic;

public class Test extends BaseTest {

	public void TC1() {
		System.out.println("Page Title :"+driver.getTitle());
	}
	
	
	
	public static void main(String[] args) {
	
		Test obj = new Test();
		obj.setupBrowser("Chrome","https://www.w3schools.com");
		obj.TC1();		

	}

}
