package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class MultiSelectDD extends  BaseClass   {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = BaseClass.setUp(); //teacher used this one as a 2nd way, I used only "setUp();"
		
		setUp(); //In properties file, uncomment demoqa.com URL (Code written for demoqa)
		
		WebElement multiSelectDD =driver.findElement(By.id(" continentsmultiple"));
	  	
		Select select = new Select(multiSelectDD);
		
		boolean isMultiple = select.isMultiple();  //isMultiple identifies if this DD is multi select.
		System.out.println("This DropDown is Multi Select? :: "+isMultiple);
		
		if(isMultiple) {
			select.selectByIndex(1);
			select.selectByIndex(3);
			select.selectByVisibleText("Africa");
			Thread.sleep(2000);
			
		
			//select.deselectByIndex(1);//you can deselect using any method; ByIndex, ByValue, or ByVisibleText 
			select.deselectAll();
			
			
		}
		
		
		tearDown();   //BaseClass.tearDown(); --->teacher used this
		

	}

}
