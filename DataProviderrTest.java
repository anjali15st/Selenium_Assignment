package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DataProviderrTest {
 
	WebDriver driver=null;
	
	
	
	
//@BeforeTest
//  public void beforeTest() 
//{
//	System.setProperty("webdriver.chrome.driver","D:\\Chrome\\chromedriver.exe");
//	driver=new ChromeDriver();
//	driver.get("https://www.saucedemo.com/");
//   }
//@Test(priority = 0)
//public void enterusername() throws Exception
//{
//   driver.findElement(By.id("user-name")).sendKeys("standard_user");
//   Thread.sleep(3000);
//}
//
//@Test(priority = 1)
//public void enterPassword() throws Exception
//{
//   driver.findElement(By.id("password")).sendKeys("secret_sauce");
//   Thread.sleep(3000);
//}
//
//@Test(priority = 2)
//public void ClickLoginBtn() throws Exception
//{
//   driver.findElement(By.id("login-button")).click();
//   Thread.sleep(3000);
//}
//
//@Test(priority = 3)
//public void ClickSideBtn() throws Exception
//{
//   driver.findElement(By.id("react-burger-menu-btn")).click();
//   Thread.sleep(3000);
//}
//
//@Test(priority = 4)
//public void ClickLogoutbtn() throws Exception
//{
//   driver.findElement(By.id("logout_sidebar_link")).click();
//   Thread.sleep(3000);
//}
//
//@AfterTest
//public void AfterTest()
//{
//	driver.close();
//}
	@Test
	@Parameters({"username","password"})
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
	    System.out.println("bye");
	    driver.close();
	
	
	}

}
