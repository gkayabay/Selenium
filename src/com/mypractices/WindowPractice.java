package com.mypractices;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver"); 
		 
		//opening the browser by calling the constructor of ChromeDriver class and upcasting (to achive abstraction better funcionalities and security)
		WebDriver driver = new ChromeDriver();//to create object
		
		driver.get("http://uitestpractice.com/Students/Switchto"); //get to sign up page
		
		String Title = driver.getTitle();
		
		System.out.println("Main Page Title is ::"+Title);
		
		driver.findElement(By.xpath("//a[@href='http://uitestpractice.com']")).click(); 
		
		Set<String> allWindows  =  driver.getWindowHandles();
		
		System.out.println("Numbers of windows are open "+allWindows.size());
		
		 Iterator<String> it= allWindows.iterator();
		 String mainWindowHandle = it.next();
		 System.out.println("Main window handle/ID is : "+mainWindowHandle);
		 
		 String childWindow = it.next();
		 System.out.println("Child window handle/ID is : "+ childWindow);
		 
		 
		 //I am in the child window
		 driver.switchTo().window(childWindow);
		 String childTitle = driver.getTitle();
		 System.out.println("Child window title is: "+childTitle);
		 
		 driver.switchTo().window(mainWindowHandle);
		 
		 driver.quit();
		 
		 
		 
		 

	}

}
