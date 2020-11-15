package com.syntax.SeleniumReview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class PracticingWithDropDowns extends BaseClass{

	public static void main(String[] args) {
		
		setUp(); 
		
		List<WebElement> allDD= driver.findElements(By.tagName("a"));
		
		for(WebElement oneDD: allDD) {
			String dd = oneDD.getText();
			System.out.println(dd);
			
			if(dd.equals("Bootstrap List Box")) {
				oneDD.click();
				break;
			}
		}
		List<WebElement >listofDD = driver.findElements(By.tagName("li"));
		
		for(WebElement oneiTem: listofDD) {
			String item = oneiTem.getText();
		
			
			if(item.equals("Morbi leo risus")) {
				oneiTem.click();
				break;
			}
			
			
		}
tearDown();
	}

}
