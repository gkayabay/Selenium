package com.mypractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class TargetHW extends BaseClass {

	public static void main(String[] args) {
	
		setUp();
		
		List<WebElement> allLinks =  driver.findElements(By.tagName("a"));  //gives all the links
		
		System.out.println("All of the links numbers is : " + allLinks.size());
		
		int count=0;
		
		for(WebElement link: allLinks) {
          String linkText = link.getText();
          
          //linklerin url lerini print etti

          String links = link.getAttribute("href"); //attribute u href olani link getir ayni zamanda link-> url i verir
		  System.out.println(linkText+ "      "+links); 
          
		    //System.out.println(linkText);
       
		    if(!linkText.isEmpty()) {  //gives me dolu links 
		    	System.out.println(linkText);
		         count++;
		    	
			
				}
		         
		    }
          
		
		
		System.out.println("Total number of links NOT empty "+count);
		

	}

}
