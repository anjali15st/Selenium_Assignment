//ctrl+A shift+f for formatting
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locating_by_radiobutton {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement r1=driver.findElement(By.id("vfb-7-1"));
		WebElement r2=driver.findElement(By.id("vfb-7-2"));
		WebElement r3=driver.findElement(By.id("vfb-7-3"));
		Thread.sleep(3000);
		r1.click();
		Thread.sleep(1000);
		r2.click();
		Thread.sleep(1000);
		r3.click();
		Thread.sleep(1000);
		
		driver.close();
	}
}
