package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class LoginPage extends CommonMethods {

	 
	//creating the repository of element. In this class we store all the elements(that are related to this page) of the Login page
	
	//Her bir elementi of Login page inspect edip stored as a variable (public instance variable)
		public WebElement username = driver.findElement(By.id("txtUsername")); //this element can be login with ID
		
		public WebElement password = driver.findElement(By.id("txtPassword"));
		
		public WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		
		public WebElement logo= driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		
		

	}


