package com.mypractices;

import java.util.List;
import com.syntax.utils.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class DropDowns extends BaseClass{



	public static void main(String[] args) throws InterruptedException {
			setUp();
			
				driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/basic-select-dropdown-demo.html");
		
				//1.Single DropDown (Select only one)
				//If there is a select tag, use select class
				//2. Multiple DropDown 
				
		WebElement days = driver.findElement(By.id("select-demo"));
		
		Select select = new Select(days);
		
		//Select class allows us to use the dropdowns in 3 ways
		//1.Select By index   .selectByIndex
		//2. Select By visibletext
		//3.Select by value(Attribute)
				
	
		//getOptions()
		List<WebElement> optionsofDays = select.getOptions();
		System.out.println(optionsofDays.size());
		
		Thread.sleep(2000);
		select.selectByIndex(3);//Tuesday
		Thread.sleep(2000);
		select.selectByVisibleText("Thursday"); //Thursday
		Thread.sleep(2000);
		select.selectByValue("Friday"); //Friday
		
		
		//isMultiple (Birden fazla seyi secebiliriz --->multiple)  //true: multiple, False: single
		
		boolean isDayMultiple= select.isMultiple();
		System.out.println(isDayMultiple);
		
		
		//single dropdowns da deselecting is not allowed
		
		//2.Multiple Drop Down da you can select more than one
		
	    
		
		
		
	
	
				}
	
}
