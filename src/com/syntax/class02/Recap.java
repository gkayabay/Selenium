package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

	public static void main(String[] args)  {
		 
		//Commands with Page 
		//get title
		//getCurrentUrl();
		 
		String fbUrl = "https://www.ebay.com";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//windows user add .exe
		
		WebDriver driver = new ChromeDriver();//to open chrome browser
		
		driver.get(fbUrl); //to launch url
         
		String url = driver.getCurrentUrl(); //to get current url . this methods returns url
		
		System.out.println("Current URL is : "+url);
		
	
		String title = driver.getTitle();
		
		System.out.println("Title of the page is: "+title);
		
		driver.close();
		
		
	}

}
