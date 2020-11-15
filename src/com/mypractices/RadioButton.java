package com.mypractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class RadioButton extends BaseClass  {

public static void main(String[] args) throws InterruptedException {
		setUp();
		
			driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/basic-checkbox-demo.html");
			
			List<WebElement> radioGender = driver.findElements(By.xpath("//input[@name = 'optradio']"));
			
			System.out.println(radioGender.size());
			
		
			for(int i =0; i<radioGender.size(); i++) {
				String valueGender= radioGender.get(i).getAttribute("value");
			
				
				if(valueGender.equalsIgnoreCase("Male"));
			
			
			
			}
			
			
}
	
	
	

}
