package com.syntax.hw;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hws4 {
	
	
	public static String url= "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
/*

TC 4: Radio Buttons Practice  
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Radio Buttons Demo” links
Click on any radio button in “Radio Button Demo” section.
Verify correct radio is clicked
Click on any radio button in “Group Radio Buttons Demo” section.
Verify correct checkbox is clicked
Quit browser
 */
	
	System.setProperty("webdriver.chrome.driver",  "drivers/chromedriver");
	
     WebDriver driver = new ChromeDriver();
     driver.get(url);
     driver.findElement(By.className("dropdown-toggle")).click();
     driver.findElement(By.xpath("//a[text()=  'Radio Buttons Demo' ]")).click();
     WebElement mRadioButton = driver.findElement(By.xpath("(//input[@name= 'optradio']) [1] "));
    
     Thread.sleep(3000);
     mRadioButton.click();
     
     
     System.out.println(mRadioButton.isSelected());
     System.out.println(mRadioButton.isDisplayed());
     System.out.println(mRadioButton.isEnabled());
     
     System.out.println("----------------------------");
     
     
     driver.findElement(By.xpath("(//input[@ name='gender'] ) [1] ")).click();
     
     
    WebElement ageRadioButton= driver.findElement(By.xpath("(//input[@ name='ageGroup'] ) [1] "));
    
    Thread.sleep(3000);
    
    ageRadioButton.click();
    
    System.out.println(ageRadioButton.isSelected());
    System.out.println(ageRadioButton.isDisplayed());
    System.out.println(ageRadioButton.isEnabled());
    
    
        
     driver.quit();
     	
	}

}
