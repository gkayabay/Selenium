package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class HW2 extends BaseClass {

	//TC 2: Delete Employee
	//Open chrome browser
	//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
	//Login into the application
	//Add Employee
	//Verify Employee has been added
	//Go to Employee List
	//Delete added Employee
	//Quit the browser

	public static void main(String[] args) throws InterruptedException {
	       
		setUp();
		
		
		//Login to HRMS application
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
		
		
		//Navigate to employee page
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		
		//Add an Employee
		String firstName = "Mahbub";
		String lastName = "Iltaf";
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		
		//grab the employee ID for later use
		String empID = driver.findElement(By.id("employeeId")).getAttribute("value"); //inspect the emp id and grab the value
		driver.findElement(By.id("btnSave")).click();  //save button
		
		String empDetails = driver.findElement(By.id("Profile-pic")).getText(); //bu bane employee id ve resminin oldugu ekrani verir
	
		if(empDetails.equals(firstName+" "+lastName)) {
			System.out.println("Employee was successfully added");
		}else {
			System.out.println("Employee was NOT added");
		}
		
		
		//Navigating to Employee List
		driver.findElement(By.linkText("Employee List")).click();
		
		//define flag variable
		boolean found = false;
		
		while(!found) {   //if empId is true, go inside the loop 
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id ='resultTable]/tbody/tr"));
			
			for(int i=0; i<rows.size(); i++) {
				String rowText = rows.get(i-1).getText();  //skip the header
				if(rowText.contains(empID)) {     //empID unique old icin bunu kullandi isimle aramak yerine. isim duplicate olabilir diye
					found = true;
					
					//delete the employee
					driver.findElement(By.xpath("//table[@id ='resultTable]/tbody/tr["+i+"]/td[1]")).click(); //ilk colom daki cehck boxlar
					Thread.sleep(4000);
					driver.findElement(By.id("btnDelete")).click();
					Thread.sleep(4000);
					driver.findElement(By.id("dialogDeleteBtn")).click();
					break;
				}
				
			}
			//if employee ID is Not found, click next button
			driver.findElement(By.xpath("//a[text()='Next']")).click(); //if it is not found keep going to next page and loop through
		}
		Thread.sleep(5000);
		tearDown();
		
		
		

	}

}
