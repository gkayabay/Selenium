package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HW1 extends CommonMethods{
    
//TC 1: Table headers and rows verification
//Open chrome browser
//Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//Login to the application
//Verify customer “Susan McLaren” is present in the table
//Click on customer details
//Update customers last name and credit card info
//Verify updated customers name and credit card number is displayed in table
//Close browser


	public static void main(String[] args) {
		
		setUp();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");

		WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
		sendText(username, ConfigsReader.getProperty("username"));

		WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
		sendText(password, ConfigsReader.getProperty("password"));
         
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		 
		String expectValue = "Susan McLaren";
		String updatedName = "Marcia Gomez";
		String updatedCardNum = "4563452876";
		
		for(int i=1; i<rows.size(); i++) {
		
		String rowText = rows.get(i-1).getText();  //get(i-1)-->takes out the header
			if(rowText.contains(expectValue)) {
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[1]")).click();
				System.out.println("Susan McLaren is present in the list , so test is passed.");
				break;
			}
		}
		
		driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[13]")).click();//Edit button
		WebElement customerName = driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtName"));
		sendText(customerName, updatedName);
		WebElement cardNumber = driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox6"));
		sendText(cardNumber, updatedCardNum);
		driver.findElement(By.cssSelector("a#ctl00_MainContent_fmwOrder_UpdateButton")).click(); //update Button
		
		WebElement name = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[2]"));
		if(name.isDisplayed()) {
			System.out.println(name.getText()+ " is displayed and updated name information.");
		WebElement cardnum = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[11]"));
		if(cardnum.isDisplayed()) {
			System.out.println(cardnum.getText()+ "  card number is updated and displayed in the table.");
		}
			
		driver.close();
		}
		
	}
	}


