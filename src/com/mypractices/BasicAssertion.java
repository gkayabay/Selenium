package com.mypractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BasicAssertion {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		//first way
		String actual =driver.getTitle();
		String expected ="Google";
		Assert.assertEquals(actual, expected);
		
		
		//Assertion 2nd way by if 
		if(expected.contains(actual)) {
			System.out.println("passed");
		}else {
			System.out.println("passed");
			
			
			
			
			
			
			
			driver.close();
		}	
	}
}
