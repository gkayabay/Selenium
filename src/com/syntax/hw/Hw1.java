package com.syntax.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
//	TC 1: HRMS Application Login: 
//		Open chrome browser
//		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
////		Enter valid username and password
//		Click on login button
//		Then verify Syntax Logo is displayed.
	
	
	
	public static String baseURL = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(baseURL);
		//driver.findElement(By.id("txtUsername"));
		//driver.findElement(By.name("txtUsername"));
		driver.findElement(By.xpath( "//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		//Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		//Thread.sleep(3000);
	 boolean isDisplay=	driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
	 if(isDisplay) {
		 System.out.println("logo is displayed, so test is passed");
	 }else {
		 System.out.println("test is failed ");
			 
		 }
	 }
	
		
		//driver.quit();
		
		
}

