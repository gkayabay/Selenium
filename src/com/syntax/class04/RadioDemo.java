package com.syntax.class04;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	public static void main(String[] args) {
 
         String url = "https://demoqa.com/automation-practice-form/";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//windows user add .exe
		
		WebDriver driver = new ChromeDriver();//to open chrome browser
		driver.get(url);
		WebElement maleRadioB = driver.findElement(By.xpath("//input[@id='sex-0']"));//is stored in maleRadioB as a WebElement
		
		System.out.println(maleRadioB.getAttribute("class"));
		
		System.out.println(maleRadioB.isDisplayed());//-->=is is present or not. gives true/false
		System.out.println(maleRadioB.isEnabled());//---.is it enable or clickable
		System.out.println("Radio button is selected :"+maleRadioB.isSelected());//false
		System.out.println("------------------------------");
		
		
		
		//1st way to click on a radio button
		maleRadioB.click();
		System.out.println("Radio button is selected: "+maleRadioB.isSelected());//true
		
		
		
		//2nd way to click on Radio button
		//it gives list of WebElements
		List<WebElement> proList = driver.findElements(By.xpath("//input[@name='profession']")); //experince year from 1 year to 7 years groupf  of elemnsts old
		
		int listSize = proList.size();
		System.out.println("Size of check box is: "+ listSize);//size 2 
		
		
		String valueToBeSelected = "Manual Tester";
		//driver.findElement(By.xpath("//input[@id='sex-0']")).getAttribute("value");
		for(WebElement profession : proList) {  //loop through the list
			
			//checking if the checkbox is enabled
			if(profession.isEnabled()) { //if the profession is enable give me the value of this attribute
				
				//get value of attribute value
				String value = profession.getAttribute("value");//get the Attribute value= " "; from the website
				System.out.println(value);
				
				if(value.equals(valueToBeSelected)) {
					profession.click();
					break;
				}
				
			}
		}

	}
}
