package com.mypractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Calenders extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    WebElement password	= driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
	
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Leabe List")).click();
		
		//click on calender image
		//you can enter an input , image--->xpath ini bulmam 
		driver.findElement(By.xpath("//img[@class= 'ui-datepicker-trigger']")).click();
		
		
		//lets select the desired month
		WebElement months = driver.findElement(By.xpath("//select[@class ='ui-datepicker-trigger-minth']"));
		
		//Becuase it is a dropdown we use select class
		Select select = new Select(months);
		select.selectByVisibleText("Sep");
		
		
		//lets select the desired year
		WebElement years = driver.findElement(By.xpath("//select[@class ='ui-datepicker-year']"));
		Select selectYear = new Select(years);
		selectYear.selectByVisibleText("2019");
		
		//lets select the desired day---.by webtable
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-trigge-calender']/tbody/tr/td"));
		
		for(WebElement day : days) {
		 String dayVal =day.getText();
		 
		 if(dayVal.equals("16")) {
			 day.click();   //dayVal 16 gune esitse git o gunu click yap ve orda dur break yap
			 break; 
		 }
		 
		}
		
		
		tearDown();
		
		

	}

}
