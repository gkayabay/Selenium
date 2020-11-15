package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://amazon.com");
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Current url is  "+ actualUrl); //gives url adress
		String title = "Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		String expectedTitle = "Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
			
	    if(title.equalsIgnoreCase(expectedTitle)) {
	    	System.out.println("You are on the right page");
	    }else {
	    	System.out.println("Please try again check the website title");
	    }
	   
		driver.navigate().to("https://zillow.com");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		if(actualUrl.contains("Zillow")) {
			System.out.println("You are inside Zillow");
		
	}else {
		System.out.println("Sorry try again it does not contains Zillow");

		
	    driver.navigate().refresh();
		driver.navigate().back();
		
		Thread.sleep(30000);
		
		driver.close();
	
	}

	}
}
