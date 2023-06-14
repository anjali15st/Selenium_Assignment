import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_demo {
	   WebDriver driver=null;
	@Before
	public void  login() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Anjali123");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Anjali123");
		Thread.sleep(3000);		
		
	}

	
	@Test
	public void sign_in() throws Exception
	{
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
	
	}
	
	@After
	public void sign_out()
	{
		driver.close();
	}
		
}

