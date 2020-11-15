package com.mypractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.utils.CommonMethods;

public class RadioButtonPractice extends CommonMethods {
	

	private WebDriver driver;
	
	@BeforeMethod
	public void Method () {

	driver.get("http://www.tizag.com/htmlT/htmlradio.php");
	}
	
	@Test 
	public void radioButton() {
		List<WebElement> radioBtns = driver.findElements(By.xpath("//div[@class='display']"));
	
	for(WebElement each :radioBtns) {
		each.click();
		wait(3);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
