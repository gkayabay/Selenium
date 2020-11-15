package com.mypractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			System.out.println(driver.getTitle());
			
			driver.get("https://www.amazon.com/");
			System.out.println(driver.getTitle());
			driver.navigate().back();
		
			
			
			
		
		
		
		
	}

}
