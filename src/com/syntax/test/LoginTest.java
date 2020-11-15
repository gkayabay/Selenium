package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
	
		/*
		 * User should be able to login to the application with valid credentials 
		 */
		 
		
		//open browser and navigate to url
		setUp();
	
		
		//sending username

		WebElement username = driver.findElement(By.id("txtUsername"));   //find or identify the element 
		sendText(username, ConfigsReader.getProperty("username"));     //(username, text)---> text or name comes from ConfigsReader methodunda getProperty methodundan gelir
		
		Thread.sleep(2000);
		
		//sending password 
		WebElement password = driver.findElement(By.id("txtPassword")); //I will perfom sendText to this element
		sendText(password, ConfigsReader.getProperty("password")); //I will send a text to my password element , what is the text. Text is "password"
		
		Thread.sleep(2000);
	
		//click on login
		WebElement loginButton = driver.findElement(By.xpath("//input[@id ='btnLogin']"));
		loginButton.submit();
	
		
		
		
		//close browser
		//tearDown();

	}

}
