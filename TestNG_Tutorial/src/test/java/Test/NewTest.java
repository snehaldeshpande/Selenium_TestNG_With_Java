package Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	String chromedriver;

	@Test
	public void method() throws InterruptedException {

		System.out.println("Method executed");

		//System.out.println("testing");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Edureka",Keys.ENTER
		);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();

	}

	@Test
	public void method1 () throws InterruptedException {
		System.out.println("Method1 executed");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Edureka",Keys.ENTER);

	}
	
	@Test
	public void method2 () throws InterruptedException {
		System.out.println("Method2 executed");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Edureka",Keys.ENTER);

	}

	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
System.out.println("Before Method");
	}

	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}

	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");
	}

	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("After class");
	}

	@org.testng.annotations.BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test");
	}

	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}

	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite");
	}

	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println("After suite");
	}

}
