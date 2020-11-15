package com.syntax.class03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdXpathDemoMyPractice {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			
		WebDriver driver=new ChromeDriver();
	    String Url= "https://learn.letskodeit.com";
	  
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(Url);
		
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		
		driver.findElement(By.id("user_email")).sendKeys("gkay@gmail.com");
		
		

	}

}
