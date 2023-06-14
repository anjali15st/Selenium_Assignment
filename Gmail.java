import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
	
	public static void main(String[] args) throws Exception {
		
		  System.setProperty("webdriver.chrome.driver","D:\\Chrome\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  Thread.sleep(3000);
		  driver.get("https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		  Thread.sleep(3000);
		  driver.findElement(By.name("firstName")).sendKeys("Priya");
		  Thread.sleep(3000);
		  driver.findElement(By.name("lastName")).sendKeys("Shah");
		  Thread.sleep(3000);
		  driver.close();
		  

	}
}
