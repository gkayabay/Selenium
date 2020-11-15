package com.mypractices;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.BaseClass;

public class Syncranization extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		setUp();

		driver.findElement(By.linkText("Alerts & Modals")).click();
		
		WebElement alertBoxButton = driver.findElement(By.xpath("//button[text(), 'Click for Prompt Box']"));
	
		WebDriverWait wait = new WebDriverWait(driver, 10); //driver 10 sn beklesin
		
		wait.until(ExpectedConditions.elementToBeClickable(alertBoxButton));
		
		alertBoxButton.click();
		
		Thread.sleep(3000);
		
		tearDown();

	}

}
