package com.mypractices;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkbox {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
	setUp();
	driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
	}
	
	@Test
	public void checkbox() {
		List<WebElement> elements = driver.findElements(By.className("display"));
		for(WebElement each : elements) {
			each.click();
			
	
			
	//isEnabled--->check if the element is enabled or not-->returns true or false 
		}
		
	}
	
	

}
