import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	Select country=new Select(driver.findElement(By.name("country")));
	country.selectByVisibleText("ITALY");
	Thread.sleep(3000);
	country.selectByValue("INDIA");
	Thread.sleep(3000);
	country.selectByIndex(20);
	Thread.sleep(3000);
	driver.close();
	
	
}


}

