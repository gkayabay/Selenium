package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HW2 extends CommonMethods {

	//TC 2: Delete Employee
	//Open chrome browser
	//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
	//Login into the application
	//Add Employee
	//Verify Employee has been added
	//Go to Employee List
	//Delete added Employee
	//Quit the browser

	public static void main(String[] args) {
		setUp();
		ChromeLogProperty();
		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		//driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		sendText(firstname, "Necip Fazil");
		WebElement lastname = driver.findElement(By.id("lastName"));
		sendText(lastname, "Kisakurek");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> employeeNames = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td"));
		String expectValue = "Necip Fazil Kisakurek";
		
		for(int i=1; i<employeeNames.size(); i++) {
			String emp = employeeNames.get(i-1).getText();
			if(employeeNames.contains(expectValue)) {
				System.out.println(expectValue+" is added in the table.");
			}
		}

	
	}

}
