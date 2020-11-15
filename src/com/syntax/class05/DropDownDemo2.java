package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp(); //In properties file, uncomment demoqa.com URL (code written for demoqa.com). 

		WebElement continents = driver.findElement(By.id("continents"));//1st inspect or find the element 

		Select select = new Select(continents);//2. select class 

		List<WebElement> options = select.getOptions(); // return the list of all optons in the DropDown

		for (WebElement option : options) { // i iterate the value by one by one from the Drop Down list
			
			String text = option.getText(); // .getText()---->gives the options as a text
			System.out.println(text);

			if (text.equals("Africa")) { // choose the desired choice and selected
				option.click(); // click(); burda select gibi kullanildi
				String ddText = option.getText();

				if (ddText.equals("Africa")) {
					System.out.println("Africa is selected::" + option.isSelected());
				} else {
					System.err.println("Africa is NOT selected");
				}
			}
			
			
			// select.selectByVisibleText("Antartica"); //selectByVisibleText
		}

		boolean isMultiple = select.isMultiple();
		System.out.println("The Continent DD is Multiple:: " + isMultiple); //isMUltiple(); shows if the DD is multi select or not.

		tearDown();

	}
}

