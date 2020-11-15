package com.mypractices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class JavaScriptExecuter extends BaseClass {
	//JavaScript is interface
	//JSExecuter baska langualerle bize calisma imkani verir
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    WebElement password	= driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		 WebElement  loginBtn	= driver.findElement(By.className("button"));
			
		
		//lets pretend click is not working
		//driver.findElement(By.className("button")).click();
		
		//to click we need JSExecutor Interface in Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;     //downcasting  driver i JSExecutor a cevirdik
		
		
		 //click icin        //  script, path(location where we want)  
		js.executeScript("arguments[0].click()", loginBtn);   //login button i javaScript ile click yapip yapmadigini check ettik
		
		
		//Highlighting
		js.executeScript("arguments[0].style.backgroundColor = 'Purple'", loginBtn); //loginBtn oldugu yeri highlight purple yapmasini istiyorum
		
		Thread.sleep(3000);
		
		//click
		js.executeScript("arguments[0].click();", loginBtn);

		//we can scroll up and down 
		js.executeScript("window.scrollBy(0,25000)");  //sayfayi scroll up and down yapar.
		
		
		
		
		
		
		
		
	}

}
