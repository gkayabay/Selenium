package com.mypractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FramePractice extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
	//to go  to first frame	
	driver.findElement(By.linkText("Others")).click();
	driver.findElement(By.linkText("Iframe")).click();
	
	driver.switchTo().frame("FrameOne");
	
	driver.findElement(By.linkText("Home")).click();
		
		
	driver.switchTo().defaultContent(); //ana sayfaya gelmek icin cikmak lazim 
	
	//to go to second frame
	WebElement frameTwo = driver.findElement(By.xpath("//iframe[@name = 'FrameTwo']")) ;//2nd frame in inspecti
	driver.switchTo().frame(frameTwo);
	
	WebElement logo = driver.findElement(By.xpath("//a[@class= 'custom-logo-link']"));

	boolean logoIsDisplay = logo.isDisplayed();
		
		if(logoIsDisplay) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}
		Thread.sleep(2000);
		

		tearDown();
	}

}
