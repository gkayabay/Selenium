package com.syntax.class06;

import javax.xml.soap.Text;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.BaseClass;
//
//TC 1: JavaScript alert text verification
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Alerts & Modals” links
//Click on “Javascript Alerts” links
//Click on button in “Java Script Alert Box” section
//Verify alert box with text “I am an alert box!” is present
//Click on button in “Java Script Confirm Box” section
//Verify alert box with text “Press a button!” is present
//Click on button in “Java Script Alert Box” section
//Enter text in the alert box
//Quit browser

public class HWAlertBox extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		
		setUp();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		
		//Click on “Alerts & Modals” links
        driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[2]/a")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.linkText("Javascript Alerts")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class= 'btn btn-default'] ")).click();
		
	   Thread.sleep(2000);
		
       Alert  alert = driver.switchTo().alert(); //driver check box tan alert box a gittti ve Alert type in da
      
       String alertVal= alert.getText();  //alertbox in icindeki Tex get eder.            
       System.out.println("Alert box with text is present: "+ alertVal); //" I am an alert box"
       
       if(alertVal.contains("I am an alert box")) {
    	   System.out.println("Alert box is displayed, so Test is passed.");
       }else {
    	   System.out.println("Test is failed.");
       }
       
       Thread.sleep(2000);
       
       alert.accept(); //alert box i kabul et 
       //2. Confirm Box
       driver.findElement(By.xpath("(//button[@class= 'btn btn-default btn-lg']) [1]")).click();
       System.out.println(alert.getText()+ "--->is present");

       //3.prompt box
       String name = "Gulbahar";
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		String prompttext = promptAlert.getText(); //get the text from alert box
		System.out.println("This is Prompt alert text : "+prompttext);
		promptAlert.sendKeys("Gulbahar");
		promptAlert.accept();//ok or cancel 
		
		String text = driver.findElement(By.xpath(" //div[@id= 'demo']")).getText();
		System.out.println("Text added to the alert box :"+text);
		System.out.println(text);
		
		
		if(text.contains(name)) {
			System.out.println("Text was successfully added");
		}else {
			System.out.println("Text was not entered");
		}
	
       
       
       
		
	
	
	
	
tearDown();

	}

}
