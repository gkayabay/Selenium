package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
 
	public static void main(String[] args) throws InterruptedException {
       
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//windows user add .exe
		
		WebDriver driver = new ChromeDriver();//to open chrome browser
		
		driver.get("https://www.facebook.com");
		
		//type the email and password
		driver.findElement(By.id("email")).sendKeys("syntaxtest.yahoo.com");  //give me the ID of element here is "email" //to find an element on the browser
	    
		driver.findElement(By.id("pass")).sendKeys("syntax123");
		driver.findElement(By.xpath("//label[@id='loginbutton' ]")).click();
		
	    //driver.findElements(By.id("u_0_b")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.linkText("Forgot Password")).click();
		
		//driver.findElement(By.id("u_0_b")).click();//id is always stable. if id has numbers and letters so there is a high chance that id changes not stable
	driver.close();
	}                   

}
