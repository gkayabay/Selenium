package com.mypractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;


//1st way of Page OBject Model (POM)
public class SmartBearLoginPage extends CommonMethods {

	public WebElement username= driver.findElement(By.xpath("//label[contains(@for,  'username')]/following-sibling::input[1]"));
	
	public WebElement password= driver.findElement(By.xpath("//input[contains(@id,  'username')]/following-sibling::input[1]"));
	
	public WebElement loginBtn =driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
    
	public WebElement text =driver.findElement(By.xpath("//p[@style='text-align: center']/following-sibling::p[1]"));

}
