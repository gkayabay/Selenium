package com.mypractices;



import java.util.List;
import com.syntax.utils.BaseClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	public class Alerts extends BaseClass{

		public static void main(String[] args) throws InterruptedException {
			
			setUp();
				
			driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/javascript-alert-box-demo.html");
			
			driver.findElement(By.xpath("//button[@class= 'btn btn-default'] ")).click();
	
			 Thread.sleep(2000);
			
            Alert  alert = driver.switchTo().alert(); //driver check box tan alert box a gittti ve Alert type in da
           
            String alertVal= alert.getText();  //alertbox in icindeki Tex get eder.            
            System.out.println(alertVal); //" I am an alert box"
            
            Thread.sleep(2000);
            
            alert.accept(); //alert box i kabul et 
            
            driver.findElement(By.xpath("(//button[@class= 'btn btn-default btn-lg']) [2]")).click();
            
            Thread.sleep(2000);
           
            alert.accept();
            Thread.sleep(2000);
            alert.sendKeys("hello");
            Thread.sleep(2000);
            
            alert.accept();

			
	}

}
