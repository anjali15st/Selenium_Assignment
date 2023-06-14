import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Partial_link_text {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	String theLinkText=driver.findElement(By.partialLinkText("egis")).getText();
	System.out.println("theLinkText");
	Thread.sleep(3000);
	theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();		
    System.out.println(theLinkText);
	
	
	Thread.sleep(3000);
	driver.close();
}
}
