import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_click {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	WebElement home=driver.findElement(By.linkText("Home"));
	WebElement flights=driver.findElement(By.linkText("Flights"));
	WebElement hotels=driver.findElement(By.linkText("Hotels"));
	WebElement carrentals=driver.findElement(By.linkText("Car Rentals"));
	WebElement cruises=driver.findElement(By.linkText("Cruises"));
	WebElement destinations=driver.findElement(By.linkText("Destinations"));
	WebElement vacations=driver.findElement(By.linkText("Vacations"));
	Actions builder=new Actions(driver);
	Action movetoHome=builder.moveToElement(home).build();
	movetoHome.perform();
	Thread.sleep(1000);
	
	Action movetoFlights=builder.moveToElement(flights).build();
	movetoFlights.perform();
	Thread.sleep(1000);
	
	Action movetoHotels=builder.moveToElement(hotels).build();
	movetoHotels.perform();
	Thread.sleep(1000);
	
	Action movetoCarrentals=builder.moveToElement(carrentals).build();
	movetoCarrentals.perform();
	Thread.sleep(1000);
	
	Action movetoCruises=builder.moveToElement(cruises).build();
	movetoCruises.perform();
	Thread.sleep(1000);
	
	Action movetoDestinations=builder.moveToElement(destinations).build();
	movetoDestinations.perform();
	Thread.sleep(1000);
	
	Action movetoVacations=builder.moveToElement(vacations).build();
	movetoVacations.perform();
	Thread.sleep(1000);
	driver.close();
}
}
