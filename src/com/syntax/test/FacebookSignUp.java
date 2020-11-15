package com.syntax.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class FacebookSignUp  extends CommonMethods {
	/*
	 * Using functions ONLY sign up to Facebook account
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
	
		//open browser and navigate to the url
		setUp();
	
		//sending email
		WebElement username = driver.findElement(By.name("firstname"));   //find the element email
		sendText(username, ConfigsReader.getProperty("username"));     //(username, text)---> text or name comes from ConfigsReader methodunda getProperty methodundan gelir
				
		//sending password 
		WebElement lastname = driver.findElement(By.name("lastname"));
		sendText(lastname, ConfigsReader.getProperty("lastname"));
		
		WebElement email = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));   //find the element email
		sendText(email, ConfigsReader.getProperty("email")); 
		
		WebElement password = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));   //find the element email
		sendText(password, ConfigsReader.getProperty("password")); 
		
		WebElement mobilenumber = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));   //find the element mobile
		sendText(mobilenumber, ConfigsReader.getProperty("mobilenumber")); 
		
		List<WebElement> chBoxes = driver.findElements(By.xpath("//input[@class= '_8esa']"));
		clickRadioOrCheckbox(chBoxes, "1");
		
		
		//dropdowns
		
		
		//signup button
		WebElement signUp= driver.findElement(By.xpath("//button[@name ='websubmit']")); //tag name also has to match if not then it gives UnexpectedTagNameException
		signUp.click();
        System.out.println("You signed up successfully, Test is passed.");		
		
	
		//month dropdowns
     	WebElement monthDD = driver.findElement(By.id("month"));
		Select obj = new Select(monthDD);
		obj.selectByVisibleText("Aug");
		
		
		//2nd way to find month by index
		//select month by index
		//WebElement monthDD = driver.findElement(By.id("month"));
		//selectDdValue(monthDD, 8);
		
		
		//day dropdown
		//selecting day by 
		WebElement dayDD = driver.findElement(By.id("day"));
		selectDdValue(dayDD, "5");
		
		//select year
		WebElement yearDD= driver.findElement(By.id("year"));
		selectDdValue(yearDD, "1986");
		
		
		
		Thread.sleep(3000);
		
		//tearDown();
		

	
	}

}
