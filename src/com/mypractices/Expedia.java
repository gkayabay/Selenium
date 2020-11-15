package com.mypractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Expedia extends BaseClass {

	//Task- loginto the website 
	
	
	public static void main(String[] args) throws InterruptedException {

		
		setUp(); 
		//from city
	    driver.findElement(By.xpath("//i[@id='myButtonDepartureDate']")).click();
	    
	    //get the month and year 
	   String dMonth =  driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	   
	   while(!dMonth.equals("July")) {
		   driver.findElement(By.xpath("//a[@title='Next']")).click();
		   Thread.sleep(2000);
		   dMonth =  driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	   }
	   
	   List<WebElement> departCells = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
	   
	   for(WebElement departCell: departCells) {
		 String departText = departCell.getText();
		 if(departText.equals("7")) {
			 departCell.click();
			 break;
		 }
	   }
	   
	   //grab the Month if it is equal to October
	   driver.findElement(By.cssSelector("input#returndate")).click();
	   
	  String returnMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	   
	  while(!returnMonth.equals("October")) {
		  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //clck Next button
		  Thread.sleep(3000);
		 returnMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	  }
	  
	  
	  //get the calendar for the day
	  List<WebElement> returnCells = driver.findElements(By.xpath("//table[@class= 'ui-datepicker-calendar']/tbody/tr/td"));
	  
	  for(WebElement returnCell:returnCells) {
		  String retunText = returnCell.getText();
		  if(retunText.equals("8")) {
			  returnCell.click();
			  break;
		  }
	  }
	}
}
		

	


