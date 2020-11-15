package com.mypractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.BaseClass;


public class AlertPopUpsRecap extends BaseClass {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		/*UnhandledAlertException : Modal Dialog Present
		 * Alert alert =driver.switchTo().alert();
		 * 
		 * alert.accept();
		 * alert.dismiss();
		 * alert.getText();
		 * alert.sendKeys();
		 */
		
		//Prompt Box (icine yazi yazilan  alert boxlar)
		setUp();
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[2]/a")).click();  
		Thread.sleep(2000);
		driver.findElement(By.linkText("Javascript Alerts")).click(); //click JAvascript Alerts
		Thread.sleep(2000);
			
		//inspect the box 
		driver.findElement(By.xpath("//button[text() = 'Click for Prompt Box']")).click();
		
		//Call Alert for switch
		Alert alert= driver.switchTo().alert();
		String alertBoxText =alert.getText();//get the text inside and below the box
		
		System.out.println(alertBoxText);
		
		//type the name inside box and accept ok
		String name = "John Smith";
		alert.sendKeys(name);
		alert.accept();
		
		//inspect the message right below the box and inside the box 
		WebElement promptMessage = driver.findElement(By.id("promt-demo"));
		String msg = promptMessage.getText();  //get the mesaaage 
		
		if(msg.contains(name)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		Thread.sleep(3000);
		
		
		
		tearDown();
		

	}

}
