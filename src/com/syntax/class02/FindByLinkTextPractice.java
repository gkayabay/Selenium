package com.syntax.class02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByLinkTextPractice {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicitly waits for 10 seconds 
		
		String url = "https://www.coldwellbankerhomes.com/";
		
		driver.get(url);
		
		driver.findElement(By.partialLinkText("About ")).click();
		
		//driver.findElement(By.linkText("Sign In")).click();
		
		//Thread.sleep(3000);//waits 3 seconds between after Sign in click then goes to Search for Homes
		
		//driver.findElement(By.partialLinkText("Search for Hom")).click();
		
		driver.findElement(By.name("searchtext")).sendKeys("Boston, MA");
         
		driver.findElement(By.className("submit-btn")).submit();
		
		driver.findElement(By.tagName("a")).click();
		
		
		Thread.sleep(3000);
		
		driver.close(); 
		
		

	}

}
