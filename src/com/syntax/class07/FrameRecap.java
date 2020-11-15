package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class FrameRecap {

	public static void main(String[] args) {
		
		// lunch this url from properties file.
		// http://166.62.36.207/syntaxpractice/bootstrap-iframe.html

		WebDriver driver = BaseClass.setUp();

		// Main window da Home link is inpected
		boolean isHomeDis = driver.findElement(By.xpath(" //a[ href ='./index.html']")).isDisplayed(); // Home link on
																										// the default
		System.out.println("Is Home Link Displayed? " + isHomeDis);

		//iframe By name(String name)
		driver.switchTo().frame("FrameOne"); 

		//Inside FrameOne there is a text "Welcome to Selenium Easy" 
		String WellcomeMessage = driver.findElement(By.xpath("//h3[text() = 'Welcome to Selenium Easy']")).getText();
		System.out.println(WellcomeMessage);

		//switch to main window
		driver.switchTo().defaultContent(); // back to main window or page

		//using By Name (String name)
		driver.switchTo().frame("FrameTwo");

		boolean buttonEnabled = driver.findElement(By.xpath("//a[@class= 'enroll-btn']")).isEnabled();//it enroll button present 
		System.out.println("Is enroll button enabled? " + buttonEnabled);

	}
}
