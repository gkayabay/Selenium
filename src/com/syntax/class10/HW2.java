package com.syntax.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;



public class HW2 {

//	TC 2: Upload file and Take Screenshot
//	Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
//	Upload file
//	Verify file got successfully uploaded and take screenshot

	public static void main(String[] args) throws InterruptedException {
		
		String filePath = "/Users/gulbahar/Desktop/MYHW.png";
		
		String url = "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
		 Thread.sleep(5000);

		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	    driver.manage().window().maximize();
		
		//locate the choose the element and send() path of file to it.(FilePath i bu elementin oldugu yere gonder)
		driver.findElement(By.xpath("//input[@id='gwt-debug-cwFileUpload']")).sendKeys(filePath);
	     
		Thread.sleep(5000);
		

		driver.findElement(By.xpath("//button[contains(text(),'Upload File')]")).click();
		Thread.sleep(5000);
//		//click on upload button
//        WebElement login = driver.findElement(By.xpath("//button[@type='button']"));
//        
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//    	js.executeScript("arguments[0].click()", login);
        
        Thread.sleep(3000);
       
        
        driver.quit();
        
	}

}
