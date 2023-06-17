package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvidebyXml {

	WebDriver driver=null;
	
	@Test
	@Parameters({"username,password"})
	
	public void test(String username,String password) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
	    Thread.sleep(3000);
	    driver.findElement(By.id("password")).sendKeys(password);
	    Thread.sleep(3000);
	    driver.findElement(By.id("login-button")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("react-burger-menu-btn")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("logout_sidebar_link")).click();
	    Thread.sleep(3000);
	    driver.close();
	
	
	}
	
}
