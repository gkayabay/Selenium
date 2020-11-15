package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		String Url = "http://newtours.demoaut.com/";
		
		driver.get(Url);
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();

		                            //tagName[@attribute = 'value']         ]
		driver.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("Rose");
		driver.findElement(By.xpath("//input[@name = 'lastName']")).sendKeys("Kayabay");
		driver.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("9876543210"); 
		driver.findElement(By.xpath("//input[@name = 'userName']")).sendKeys("rose"); 
		driver.findElement(By.xpath("//input[@name = 'adress1']")).sendKeys("123 Test"); 
		driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("Boston"); 
		driver.findElement(By.xpath("//input[@name = 'state']")).sendKeys("MA");
		driver.findElement(By.xpath("//input[@name = 'postalCode']")).sendKeys("01465"); 
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("gkayabay@gmail.com"); 
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("9876");
		driver.findElement(By.xpath("//input[@name = 'confirmPassword']")).sendKeys("9876");
		driver.findElement(By.xpath("//input[@src = 'images/forms/submit.gif']")).click();
		
		
		
		
		
		

	}

}
