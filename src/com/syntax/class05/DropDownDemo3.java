package com.syntax.class05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo3 extends BaseClass {

	public static void main(String[] args) {
		
		
		ArrayList <String> expectedList = new ArrayList(); //store all expected values in your list 
		expectedList.add("Asia");
		expectedList.add("Europe");
		expectedList.add("Africa");
		expectedList.add("Australia");
		
		
		setUp(); //in properties file, uncomment demoqa.com URL(Code written for demoqa.com).
		
		WebElement continents = driver.findElement(By.id("continents")); //id= continents
		
		Select select = new Select(continents);
	
		select.selectByVisibleText("AUS");  //AUS is the value of Value Attribute in the DOM (value=AUS) by ByVisibleText();
		
		List<WebElement> optionList = select.getOptions(); //.getOptions()--->returns the all the options form the DropDown
         
	
		Iterator <WebElement> it = optionList.iterator();
		
		while (it.hasNext()) {//if there is next value, get the text of it
		String text = it.next().getText();//every elements will returns a text so we call -->>getText(); metodu
		
		System.out.println(text);
		
		}
		
		if(expectedList.containsAll(optionList)) {
			System.out.println("The list macthes");
		}else {
			System.err.println("List DID NOT match");
		}
		
		tearDown();
	}

}
