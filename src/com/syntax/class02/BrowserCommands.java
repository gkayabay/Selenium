package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");//to launch the url. it not store the history
		
		driver.manage().window().fullscreen();//to maximize or make the fullscreen of the browser
		//driver.manage().window().maximize();  you can maximize or fullscreen with this too
		 
		Thread.sleep(3000);
		
		driver.navigate().refresh();//refresh the page
		
		
		driver.navigate().to("https://www.google.com"); //to launch to specific url
		
		driver.navigate().back();//to navigate back (go one step back)
		
		Thread.sleep(30000);//to change the speed 
		
		driver.navigate().forward();
		
		driver.close();
		
		
		
		

	}

}
