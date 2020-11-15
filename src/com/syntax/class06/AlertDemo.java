package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class AlertDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
	 //Types of alerts 
		//1.regular alert box
	    setUp(); //Below code is for UItestPractice.com        //WebDriver driver = BaseClass.setup();--> teacher bu methodla yazdi 
		
		driver.findElement(By.xpath("//button[@id = 'alert']")).click();
		

		
		// Handling Simple alertPopups                             Alert is an interface 
		Alert simpleAlert = driver.switchTo().alert(); //switch attention to the alertBox.
		
		Thread.sleep(1000);
		
		//get text from alert box
		String simpleAText = simpleAlert.getText();
		System.out.println("This is simple alert text::"+simpleAText);
		Thread.sleep(1000);
		simpleAlert.accept();
		Thread.sleep(1000);
		
		
		//2nd type: Handling confirmation  alert box
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();//switch attention
		Thread.sleep(1000);
		String confirmAText = confirmAlert.getText();
		System.out.println("This is confirm alert text::"+confirmAText);
		Thread.sleep(1000);
		confirmAlert.dismiss();
		
		//3. Type Prompt Alert
		//Handling Prompt alerts/confirmation alerts by providing some confirmation message
		//message
		String name = "Alex";
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("This is Prompt alert text : "+promptAlert.getText());	//get the text from alert box
		promptAlert.sendKeys(name);
		promptAlert.accept();//ok or cancel 
		
		String text = driver.findElement(By.xpath(" //div[@id= 'demo']")).getText();
		System.out.println("Text added to the alert box :"+text);
		System.out.println(text);
		
		
		if(text.contains(name)) {
			System.out.println("Text "+ name+ " was successfully added");
		}else {
			System.out.println("Text "+name+" was not entered");
		}
	
      BaseClass.tearDown(); //Teachers 2nd way
	}

}
