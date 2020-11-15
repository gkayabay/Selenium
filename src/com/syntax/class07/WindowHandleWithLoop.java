package com.syntax.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWithLoop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		// opening the browser by calling the constructor of ChromeDriver class and
		// upcasting (to achive abstraction better funcionalities and security)
		WebDriver driver = new ChromeDriver();// to create object

		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		String signUpTitle = driver.getTitle();

		System.out.println("Main Page Title is ::" + signUpTitle);

		String parentWindowHandle = driver.getWindowHandle(); // gives ID of Parent window (grab the handle of Parent
																// window)
		System.out.println("What is the ID of Parent Window Handle? " + parentWindowHandle);

		for (int i = 1; i < 3; i++) { // click on the same link 3 times (to open 3 times same window)
			driver.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
			Thread.sleep(1000);

			
			Set<String> allWindowHandles = driver.getWindowHandles();
			
			for (String handle : allWindowHandles) { // loop through each window , get the ID of each Window, and
				System.out.println("ID of the window:: " + handle);
				driver.switchTo().window(handle);
				driver.get("https://www.google.com");
				Thread.sleep(2000);
				driver.close();
			}

		}

	}

}
