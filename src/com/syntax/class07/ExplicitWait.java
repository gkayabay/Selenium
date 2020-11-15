package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		 
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://166.62.36.207/syntaxpractice/dynamic-data-loading-demo.html");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.id("startButton")).click();
		

		/*
		 * The explicit wait is used to tell the Web Driver to wait for certain conditions 
		 * (Expected Conditions) or the maximum time exceeded before throwing an 
		 * "ElementNotVisibleException". Explicit wait works with ExpectedConditionsClass 
		 * and wait untill condition becomes true or max amount of time is reached.
		 */
			
		WebDriverWait wait = new WebDriverWait(driver, 20); //create obj of WebDriverWait
		//Expected condition is a class which has several methods
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(), 'Welcome Syntax Technologies')]")));
		//locate the element and wait for the element until to be located
		
	    boolean text = driver.findElement(By.xpath("//h4[contains(text(), 'Welcome Syntax Technologies')]")).isDisplayed();

		System.out.println(text);
		

	}

}
