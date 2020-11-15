package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task2 extends BaseClass {

//TC 2: Select and Deselect values
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Input Forms” links
//Click on “Select Dropdown List” links
//Select value from “Select List Demo” section
//Verify value has been selected
//Select 4 options from “Multi Select List Demo”
//Deselect 1 of the option from the dd
//Quit browser
//	

	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.get(" http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		WebElement dd = driver.findElement(By.className("dropdown-toggle"));
		dd.click();
		WebElement selDD = driver.findElement(By.linkText("Select Dropdown List"));
		selDD.click();

		Thread.sleep(2000);

		WebElement day = driver.findElement(By.id("select-demo"));
		Select select = new Select(day);

		select.selectByVisibleText("Wednesday");

	}

}
