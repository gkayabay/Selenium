package com.syntax.SeleniumReview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class getAllLinks extends BaseClass {

	public static void main(String[] args) {

		setUp();
		//put all links in a List collection
		List<WebElement> allLinks=  driver.findElements(By.tagName("a")); //get all the links as a WebElement
		int numOfLinks = allLinks.size();
		System.out.println(numOfLinks);
		
		//Loop through each link
		for(WebElement link :allLinks) {
			String textOfLink = link.getText();
			String links = link.getAttribute("href"); //attribute u href olani link getir ayni zamanda link-> url i verir
			System.out.println(textOfLink+ "      "+links); 
		}
		
		
		
		
		
		
		
tearDown();

	}

}
