package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowHandle {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver"); 
		 
		//opening the browser by calling the constructor of ChromeDriver class and upcasting (to achive abstraction better funcionalities and security)
		WebDriver driver = new ChromeDriver();//to create object
		
		driver.get("https://accounts.google.com/signup"); //get to sign up page
		
		String signUpTitle = driver.getTitle();
		
		System.out.println("Main Page Title is ::"+signUpTitle);
		
		driver.findElement(By.linkText("Help")).click();  //get the Help link and click
		
		/*
		 *How to get window handle? 
		 * In Selenium we have 2 methods to get the handle of window
		 * getWindowHandle();
		 * getWindowsHandles();
		 */
		
		//should not allow any duplicate to store so we use set of windows
		//Returns set of String IDS of all windows that are currently opened by the current instance
		Set<String> allWindowHandles = driver.getWindowHandles();//iterate over all open windows(set of windows)
		
		System.out.println("NUmber of windows are opened::" +allWindowHandles.size());//get size of set
		
		Iterator<String> it = allWindowHandles.iterator(); //iterate the windows are open 
		
		
		//By default focus wwill be in the main page
		String mainWindowHandle = it.next();  //ID of main window
		System.out.println("ID of the Main Window is ::"+mainWindowHandle);
		
		
		String childWindowHandle = it.next();//Returns the ID of Child Window
		System.out.println("ID of the Child Window is ::"+childWindowHandle);
		
		
		//Using swwitchTo method we switch to another window by passing the handle/ ID of window 
		driver.switchTo().window(childWindowHandle); //switch focus from main window to childWindow	
		
		String childWindowTitle = driver.getTitle();  //title of childpage verify
		System.out.println("Child Page Title is:: "+ childWindowTitle);
		
		//driver.close(); //close the current window or last window is opened where the focus on .
		driver.quit();//it will destroyed all the windows or quits the all windows
		
		
		
	}

}
