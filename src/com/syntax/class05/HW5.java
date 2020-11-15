package com.syntax.class05;

import java.util.List;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class HW5 extends BaseClass {
//TC 1: Amazon Department List Verification
//Open chrome browser
//Go to “http://amazon.com/”
//Verify how many department options available.
//Print each department 
//Select Computers
//Quit browser

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("http://amazon.com/");
		
		
	WebElement DD=driver.findElement(By.xpath("//select[@id='searchDropdownBox']")); //go to all


	
	Select select = new Select(DD);
	
	List<WebElement> options = select.getOptions();
	
	for(WebElement option:options) {
		String text = option.getText();
		System.out.println(text);
	
		Thread.sleep(2000);
	  
		//select.selectByValue("search-alias=computers");
		
		select.selectByVisibleText("Computers");
		select.selectByVisibleText("Books");
		Thread.sleep(2000);
		select.deselectByVisibleText("Books");

	  }
	}
	}


