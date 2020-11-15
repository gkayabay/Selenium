package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Task extends BaseClass {
	
//	
//	TC 1: Table headers and rows verification
//	Open chrome browser
//	Go to “https://www.aa.com/homePage.do”
//	Enter From and To
//	Select departure as May 14 of 2020
//	Select arrival as November 8 of 2020
//	Click on search
//	Close browser

	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).click();
		
		//get the month
		String dMonth = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
		
		while(!dMonth.equals("May")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();// click next button
			Thread.sleep(2000);
			dMonth = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
		}
		
		//select day from the from the calender
		List<WebElement> departCells = driver.findElements(By.xpath("//table/tbody/tr/td"));
		//loop through td of depart calender and grab the text and validate
		for(WebElement departCell: departCells) {
			String departText = departCell.getText();
			if(departText.equals("14")) {
				departCell.click();
				break;
			}
		}
		
		//return data
		driver.findElement(By.xpath("//input[@id='aa-returningFrom']")).click(); //click to box
		String returnMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'] )[2]")).getText(); //month inspect
		
		while(!returnMonth.equals("November")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(2000);
			returnMonth = driver.findElement(By.xpath("(//span[@class= 'ui-datepicker-month'])[1]")).getText();
			Thread.sleep(3000);
		}
		
		//select day from the calender for return
		List<WebElement> returnCells = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for(WebElement returnCell : returnCells) {
			String returnText = returnCell.getText();
			
			if(returnText.equals("8")) {
				returnCell.click();
				break;
			}
		}
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']")).click();
	    Thread.sleep(2000);
	    
	    //tearDown();

	}

}
