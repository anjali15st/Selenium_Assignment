import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_window {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(3000);
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		 String MainWindow=driver.getWindowHandle();
		
		 // To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();		
    Iterator<String> i1=s1.iterator();		
    		
    while(i1.hasNext())			
    {		
        String ChildWindow=i1.next();		
        		
        if(!MainWindow.equalsIgnoreCase(ChildWindow))	
        	
        {    		
             
                // Switching to Child window
                driver.switchTo().window(ChildWindow);	                                                                                                           
                driver.findElement(By.name("emailid")).sendKeys("anjali123@gmail.com");                			
                driver.findElement(By.name("btnLogin")).click();
                Thread.sleep(1000);
                             
		// Closing the Child Window.
                    driver.close();		
        }		
    }		
    // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
	Thread.sleep(1000);
		driver.close();

	}
}
