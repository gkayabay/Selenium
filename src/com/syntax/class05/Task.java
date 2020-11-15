package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		WebElement month =  driver.findElement(By.xpath("//select[@id ='month' ]"));
		
		Select select = new Select(month);
		
		
		

	}

}
