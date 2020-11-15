package com.SelfReview1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenaBrowser {

	public static void main(String[] args) {
		//Set the System Property and making connection with the driver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		//Open the browser and create obj 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.athenahealth.com/careers");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.close();
		
		driver.quit();
		
	}

}
