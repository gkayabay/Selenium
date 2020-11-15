package com.syntax.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {
	
//	TC 3: Syntax Demo input boxes count: 
//	Open chrome browser
//	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	Click on “Input Forms” links
//	Click on “Simple Form Demo” links
//	Get all input boxes from the page
//	Enter “Hello” to each text box
//	Close browser

	public static String baseUrl="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(baseUrl);
		//driver.findElement(By.linkText("inputforms")).click();
		driver.findElement(By.xpath( "(//a[@data-toggle='dropdown'] )  [1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" (//a[@href='basic-first-form-demo.html'] )   [1]")).click();
		
		driver.findElement(By.xpath("//input[@id='user-message'] ")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //input[@id='sum1']")). sendKeys("Hello");
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //input[@id='sum2']")).sendKeys("Hello");
		
		driver.close();
		
		
		
		
	}

}
