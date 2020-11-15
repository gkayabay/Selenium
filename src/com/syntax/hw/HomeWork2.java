package com.syntax.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {

//	TC 2: HRMS Application Negative Login: 
//		Open chrome browser
//		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//		Enter valid username
//		Leave password field empty
//		Verify error message with text “Password cannot be empty” is displayed.
	
	
	public static String baseURL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(baseURL);
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("Submit")).click();
		 boolean display = driver.findElement(By.cssSelector("span[id^='span']")).isDisplayed();
		 if(display) {
			 System.out.println("Password cannot be empty displayed so negative test passed ");
		 }else {
			 System.out.println("please check error message");
		 }
		
		 driver.close();
		 
		 
	}

}
