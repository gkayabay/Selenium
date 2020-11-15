package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// In properties file, uncomment Syntax Practice site URL (code written for
		// practice app).

		setUp(); // open chrome browser and launch Syntax Practice url
		WebElement weekDD = driver.findElement(By.id("select-demo"));

		Select select = new Select(weekDD); // create an object of Select Class.Pass the weekDD as a parameter

		/*
		 * Selenium provides 3 different ways to select a value from DD 
		 * 1.ByIndex();
		 * 2.ByVisibleText(String str);
		 * 3.ByValue();
		 * 
		 */
		
		List<WebElement> options = select.getOptions(); // gives list of WebElements(select.getOptions)
		System.out.println("Number of Operations in DD:: " + options.size()); // gives options size

		
		// select.selectByIndex(1);

		for (int i = 1; i < options.size(); i++) { // 1st method select byindex() is used here
			select.selectByIndex(i);
			Thread.sleep(1000);

		}

		// 2nd method ByVisibleText(String str)

		select.selectByVisibleText("Friday"); //we can select any option by Visible text.
		//In the parameter provide the text visible on UI.

		Thread.sleep(30000);
		tearDown();
	}

}
