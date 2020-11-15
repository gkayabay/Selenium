package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true"); //before launcng the driver, Dom da kirmizi yazilar cikmaz
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver"); 
		 
		//opening the browser by calling the constructor of ChromeDriver class and upcasting (to achive abstraction better funcionalities and security)
		WebDriver driver = new ChromeDriver();//to create object
		
		driver.get("http://166.62.36.207/syntaxpractice/window-popup-modal-demo.html"); //get to sign up page
		
        String signUpTitle = driver.getTitle();
		
		System.out.println("Main Page Title is ::"+signUpTitle);
		
		String parentWindowHandle = driver.getWindowHandle(); // gives ID of Parent window (grab the handle of Parent window)
		System.out.println("What is the ID of Parent Window Handle? "+parentWindowHandle);
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Like us On Facebook")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		
		
		//put the all windows into set of collection and get the IDs of each window
		Set<String> allWindowHandles =  driver.getWindowHandles(); //Get the all ID s of windows. Returns set of window handle of all windows
		
		Iterator<String> it = allWindowHandles.iterator();
		System.out.println("What is the Number of windows are open?: "+ allWindowHandles.size()); //Numbers of windows are open
		
		while(it.hasNext()) {
		String handle = it.next();  //get each window ID/ handle
		
		if(!handle.equals(parentWindowHandle)) {    //driver.switchTo().window(handle); switch to next window only if it is not same as parent (farkliysa)
			//each iteration will switch from one window to another
		    driver.switchTo().window(handle);
		    System.out.println(driver.getTitle());
		    driver.close();
		    Thread.sleep(1000);
		
		}
		
		}
		
	 driver.quit(); //quits the all the windows including parent window
		

	}

}
