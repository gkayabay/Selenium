package com.syntax.class06;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class HWFRame extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle' ]) [7]")).click();
		driver.findElement(By.linkText("Iframe")).click();
		
		
	    driver.switchTo().frame("FrameOne");  //you are inside frameOne 
	    driver.findElement(By.linkText("Home")).click(); //Click on HomeLInk
	    boolean logoDisplay=  driver.findElement(By.id("hide")).isDisplayed(); //is logo is display
	    
		
		if(logoDisplay) {
			System.out.println("Syntax Logo is displayed in second frame");
		}else {
			System.out.println("Syntax Logo is NOT displayed in second frame");
		}
	   
		tearDown();

	}

}
