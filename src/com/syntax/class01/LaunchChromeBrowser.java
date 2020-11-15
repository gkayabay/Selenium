package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		//For Windows users. drivers\\chromedriver.exe
		//Or \\Users\\syntax\\eclipse-workspace\\SeleniumBatchVI\\drivers\\chromedriver.exe
		 
		//for Mac users drivers/chromedriver
		 
		//Making connection to the driver
		 
		 
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver"); 
		 
		//opening the browser by calling the constructor of ChromeDriver class and upcasting (to achive abstraction better funcionalities and security)
		WebDriver driver = new ChromeDriver();//to create object
		
		driver.get("https://www.google.com");
		
		String url  = driver.getCurrentUrl(); //assign and get the current url
		
		
		System.out.println(url);
		
		System.out.println(driver.getTitle());

	}
	 
}

