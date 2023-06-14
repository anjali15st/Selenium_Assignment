import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedin_demo 
{
	
		public static void main(String[] args) throws Exception {
			
			  System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
			  WebDriver driver=new ChromeDriver();
			  //Thread.sleep(3000);
			  driver.get("https://in.linkedin.com/");
			  Thread.sleep(3000);
			  driver.findElement(By.name("session_key")).sendKeys("Anjali");
		      Thread.sleep(3000);
		      driver.findElement(By.id("session_password")).sendKeys("anjali123");
		      Thread.sleep(3000);
		      driver.findElement(By.linkText("Sign in")).click();
		      Thread.sleep(3000);
			  driver.findElement(By.linkText("New to LinkedIn? Join now")).click();
			  Thread.sleep(3000);

		 driver.close();
  }
    }


